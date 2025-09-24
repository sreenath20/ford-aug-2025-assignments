package com.demo.library.book;

public interface BookService {
    Book getBookById(Integer bookId) throws BookNotFoundException;

    Book updateBook(Book borrowBook) throws BookException;


}