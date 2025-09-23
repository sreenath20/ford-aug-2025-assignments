package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
    @PostMapping("/{id}/books")
    public Book addBook(@PathVariable Integer id, @RequestBody Book book) {
        return authorService.addBook(id, book);
    }
    @GetMapping("/{id}/books")
    public List<Book> getBooksByAuthor(@PathVariable Integer id) {
        return authorService.getBooksByAuthor(id);
    }
}