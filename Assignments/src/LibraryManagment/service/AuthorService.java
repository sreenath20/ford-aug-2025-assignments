package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;

import java.util.List;

public interface AuthorService {
    Author addAuthor(Author author);
    Book addBook(Integer authorId, Book book);
    List<Book> getBooksByAuthor(Integer authorId);

}
