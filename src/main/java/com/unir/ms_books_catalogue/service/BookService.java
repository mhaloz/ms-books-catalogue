package com.unir.ms_books_catalogue.service;

import com.unir.ms_books_catalogue.model.Book;
import com.unir.ms_books_catalogue.repository.BookRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public Optional<Book> update(Long id, Book data) {
        return repository.findById(id).map(book -> {
            if (data.getTitle() != null) book.setTitle(data.getTitle());
            if (data.getAuthor() != null) book.setAuthor(data.getAuthor());
            if (data.getCategory() != null) book.setCategory(data.getCategory());
            if (data.getPublicationDate() != null) book.setPublicationDate(data.getPublicationDate());
            if (data.getIsbn() != null) book.setIsbn(data.getIsbn());
            if (data.getRating() != null) book.setRating(data.getRating());
            if (data.getVisible() != null) book.setVisible(data.getVisible());
            return repository.save(book);
        });
    }

    public void delete(Long id) {
        repository.deleteById(id);
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
