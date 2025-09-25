package com.demo.library.author;

import com.demo.library.book.Book;
import com.demo.library.book.BookAlreadyExistsException;

import java.util.List;

public interface AuthorService {

    Author addNewAuthor(Author newAuthor) throws AuthorException;

    Book addBookForAuthor(Integer authId, Book newBook) throws AuthorNotFoundException, BookAlreadyExistsException;

    List<Book> getBooksByAuthorId(Integer authId) throws AuthorNotFoundException;

    Author getAuthorByName(String authName) throws AuthorNotFoundException;

    List<Author> getAllAuthors() throws AuthorNotFoundException;
}
