package com.unir.ms_books_catalogue.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    private String category;

    @Column(unique = true)
    private String isbn;

    private Integer rating;

    private Boolean visible;
}
