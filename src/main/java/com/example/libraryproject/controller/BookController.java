package com.example.libraryproject.controller;

import com.example.libraryproject.service.ResourceNotFound;
import com.example.libraryproject.model.Books;
import com.example.libraryproject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    //Create a book
    @PostMapping("/books")
    public Books addBook(@RequestBody Books books)
    {
        bookRepository.save(books);
        return books;
    }

    //Get all books
    @GetMapping("/books2")
    public List<Books> getBooks() {
        return bookRepository.findAll();
    }


    @PutMapping("/books/{id}")
    public ResponseEntity<Books> updateBook(@PathVariable(value = "id") Integer bookId, @RequestBody Books newBooks) {
    Books books = bookRepository.findById(bookId).orElseThrow(
            () -> new ResourceNotFound("Book doesn't exist"));
    books.setTitle(newBooks.getTitle());

    final Books updatedBooks = bookRepository.save(books);
    return ResponseEntity.ok(updatedBooks);
    }

}
