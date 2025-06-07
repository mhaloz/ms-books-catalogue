package com.unir.ms_books_catalogue.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(unique = true)
    private String isbn;

    private BigDecimal price;

    @Column(nullable = false)
    private String author;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    private String category;

    private Integer rating;

    @Column(name = "visibility")
    private Boolean visible;

    private String format;

    private Integer stock;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
