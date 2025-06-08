package com.unir.ms_books_catalogue.controller;

import com.unir.ms_books_catalogue.model.Book;
import com.unir.ms_books_catalogue.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @Operation(summary = "Crear libro")
    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book created = service.save(book);
        return ResponseEntity.status(201).body(created); // HTTP 201 Created
    }

    @Operation(summary = "Actualizar libro")
    @PatchMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Long id, @RequestBody Book data) {
        return service.update(id, data)
                .map(ResponseEntity::ok) // 200 OK
                .orElseGet(() -> ResponseEntity.notFound().build()); // 404 Not Found
    }

    @Operation(summary = "Eliminar libro")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    @Operation(summary = "Buscar libros")
    @GetMapping
    public ResponseEntity<List<Book>> search(@RequestParam(required = false) String searchTerm) {
        if (searchTerm != null && !searchTerm.isBlank()) {
            return ResponseEntity.ok(service.searchAvailableBooks(searchTerm));
        } else {
            return ResponseEntity.ok(service.getAvailableBooks());
        }
    }

    @Operation(summary = "Buscar libro por id")
    @GetMapping("/{id}")
    public ResponseEntity<Book> searchById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
