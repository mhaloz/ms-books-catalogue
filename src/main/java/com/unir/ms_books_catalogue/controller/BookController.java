package com.unir.ms_books_catalogue.controller;

import com.unir.ms_books_catalogue.model.Book;
import com.unir.ms_books_catalogue.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
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
    public Book create(@RequestBody Book book) {
        return service.save(book);
    }

    @Operation(summary = "Actualizar libro")
    @PatchMapping("/{id}")
    public Optional<Book> update(@PathVariable Long id, @RequestBody Book data) {
        return service.update(id, data);
    }

    @Operation(summary = "Eliminar libro")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @Operation(summary = "Buscar libros por filtros")
    @GetMapping
    public List<Book> search(@RequestParam Map<String, String> filters) {
        return service.search(filters);
    }
}
