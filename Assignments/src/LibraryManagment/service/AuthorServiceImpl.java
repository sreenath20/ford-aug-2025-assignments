package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.exception.AuthorNotFoundException;
import com.example.demo.exception.BookAlreadyExistsException;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepo;
    @Autowired
    private BookRepository bookRepo;
    @Override
    public Author addAuthor(Author author) {
        return authorRepo.save(author);
    }
    @Override
    public Book addBook(Integer authorId, Book book) {
        Author author = authorRepo.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found: " + authorId));
        bookRepo.findByIsbn(book.getIsbn())
                .ifPresent(b -> { throw new BookAlreadyExistsException("ISBN already exists."); });
        book.setAuthor(author);
        return bookRepo.save(book);
    }
    @Override
    public List<Book> getBooksByAuthor(Integer authorId) {
        Author author = authorRepo.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found: " + authorId));
        return author.getBooks();
    }
}
