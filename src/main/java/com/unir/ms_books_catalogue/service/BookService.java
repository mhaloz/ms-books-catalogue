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
    public Optional<Book> getById(Long id) {
        return repository.findById(id);
    }

    public List<Book> getAvailableBooks() {
        // Siempre retorna libros visibles y con stock
        return repository.findAll((root, query, cb) -> cb.and(
                cb.greaterThan(root.get("stock"), 0),
                cb.isTrue(root.get("visible"))
        ));
    }

    public List<Book> searchAvailableBooks(String searchTerm) {
        return repository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            // Reglas obligatorias
            predicates.add(cb.greaterThan(root.get("stock"), 0));
            predicates.add(cb.isTrue(root.get("visible")));

            if (searchTerm != null && !searchTerm.trim().isEmpty()) {
                String likeTerm = "%" + searchTerm.toLowerCase() + "%";
                Predicate titleMatch = cb.like(cb.lower(root.get("title")), likeTerm);
                Predicate authorMatch = cb.like(cb.lower(root.get("author")), likeTerm);
                predicates.add(cb.or(titleMatch, authorMatch));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        });
    }
}
