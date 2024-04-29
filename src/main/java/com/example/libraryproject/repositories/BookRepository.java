package com.example.libraryproject.repositories;

import com.example.libraryproject.model.Books;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface BookRepository extends CassandraRepository<Books, Integer> {
    Books findBookById(Integer id);
}
