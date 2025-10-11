package com.example.library.author;

import com.example.library.book.Book;

import java.util.List;

public interface AuthorService {
    Author addNewAuthor(Author author) throws  AuthorNotFoundException;
    Book addBooktoAuthor(Integer authorId,Book book) throws AuthorNotFoundException,BookAlreadyExistsException ;
    List<Book> getBooksByAuthor (Integer authorId)  throws AuthorNotFoundException;
}
