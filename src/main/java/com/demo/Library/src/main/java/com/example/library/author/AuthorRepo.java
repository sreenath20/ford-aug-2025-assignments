package com.example.library.author;

import com.example.library.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
    List<Book> getAuthorById(Integer Id);
}
