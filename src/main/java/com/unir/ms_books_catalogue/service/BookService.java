package com.unir.ms_books_catalogue.service;
import com.unir.ms_books_catalogue.model.Book;
import com.unir.ms_books_catalogue.repository.BookRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import com.unir.ms_books_catalogue.mapper.BookMapper;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class BookService {

    private final BookRepository repository;
    private final BookMapper bookMapper;

    public BookService(BookRepository repository, BookMapper bookMapper) {
        this.repository = repository;
        this.bookMapper = bookMapper;
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Book> update(Long id, Book data) {
        return repository.findById(id).map(book -> {
            bookMapper.updateBookFromDto(book, data);
            book.setUpdatedAt(LocalDateTime.now());
            return repository.save(book);
        });
    }

    public List<Book> search(Map<String, String> filters) {
        Specification<Book> spec = (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            filters.forEach((key, value) -> {
                switch (key) {
                    case "rating":
                        predicates.add(cb.equal(root.get(key), Integer.valueOf(value)));
                        break;
                    case "visible":
                        predicates.add(cb.equal(root.get(key), Boolean.valueOf(value)));
                        break;
                    default:
                        predicates.add(cb.like(cb.lower(root.get(key)), "%" + value.toLowerCase() + "%"));
                        break;
                }
            });
            return cb.and(predicates.toArray(new Predicate[0]));
        };

        return repository.findAll(spec);
    }
}
