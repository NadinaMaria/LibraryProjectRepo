//package com.example.libraryproject.controller;
//
//import com.example.libraryproject.ResourceNotFound;
//import com.example.libraryproject.model.Book;
//import com.example.libraryproject.repositories.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/book")
//public class BookController {
//    @Autowired
//    BookRepository bookRepository;
//
//    //Create a book
//    @PostMapping("/books")
//    public Book addBook(@RequestBody Book book)
//    {
//        bookRepository.save(book);
//        return book;
//    }
//
//    //Get all books
//    @GetMapping("/books")
//    public List<Book> getBooks() {
//        return bookRepository.findAll();
//    }
//
//
//    @PutMapping("/books/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable(value = "id") Integer bookId, @RequestBody Book newBook) {
//    Book book = bookRepository.findById(bookId).orElseThrow(
//            () -> new ResourceNotFound("Book doesn't exist"));
//    book.setTitle(newBook.getTitle());
//
//    final Book updatedBook = bookRepository.save(book);
//    return ResponseEntity.ok(updatedBook);
//    }
//
//}
