package com.unir.ms_books_catalogue.mapper;

import org.mapstruct.*;
import com.unir.ms_books_catalogue.model.Book;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper {
    void updateBookFromDto(@MappingTarget Book target, Book source);
}
