package com.demo.library.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.Year;
import java.util.List;

public interface BookService {
    Book getBookById(Integer bookId) throws BookNotFoundException;

    Book updateBook(Book borrowBook) throws BookException;

    Book addNewBook(Book newBook) throws BookAlreadyExistsException;

    List<Book> getBooksByGenre(String genre) throws BookNotFoundException;

    List<Book> getBooksByPublishYear(Year year) throws BookNotFoundException;

    Book getBookByIsbn(String isbn) throws BookNotFoundException;

    List<Book> getBooksByLanguage(String language) throws BookNotFoundException;

    List<Book> getAllBooks() throws BookNotFoundException;

    Boolean checkExistenceOfBook(Book book);

    Page<Book> getBooksInSortedOrder(Pageable pageable) throws BookNotFoundException;

    List<Book> getMostBorrowedBooks() throws BookNotFoundException;
}
