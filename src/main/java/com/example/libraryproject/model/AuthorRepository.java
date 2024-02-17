package com.example.libraryproject.model;

import com.example.libraryproject.model.inventory.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
