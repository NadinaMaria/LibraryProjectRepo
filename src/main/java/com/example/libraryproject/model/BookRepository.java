package com.example.libraryproject.model;

import com.example.libraryproject.model.inventory.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
