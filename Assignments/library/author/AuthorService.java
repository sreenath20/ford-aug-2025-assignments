package com.demo.library.author;

import com.demo.library.book.Book;

import java.util.List;

public interface AuthorService {

    Author addNewAuthor(Author newAuthor) throws AuthorException;

    Book addBookForAuthor(Integer authId, Book newBook) throws RuntimeException;

    List<Book> getBooksByAuthorId(Integer authId) throws RuntimeException;

}
