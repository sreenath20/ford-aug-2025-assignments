package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Member;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepo;
    @Override
    public Set<Member> getMembersByBook(Integer bookId) {
        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found: " + bookId));
        return book.getBorrowedByMembers();
    }
}
