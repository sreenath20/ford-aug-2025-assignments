package com.demo.library.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Integer bookId) throws BookNotFoundException {
        return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book not found for id: " + bookId));
    }

    @Override
    public Book updateBook(Book borrowBook) throws BookException {

        if(bookRepository.existsById(borrowBook.getId()))
            throw new BookException("Book already exists for id: " + borrowBook.getId());
        return bookRepository.save(borrowBook);
    }

    @Override
    public Book addNewBook(Book newBook) throws BookAlreadyExistsException {
        if(bookRepository.existsById(newBook.getId()))
            throw new BookAlreadyExistsException("Book already exists for id: " + newBook.getId());
        return bookRepository.save(newBook);
    }

    @Override
    public List<Book> getBooksByGenre(String genre) throws BookNotFoundException {
        List<Book> foundBooks = bookRepository.findBooksByGenreIgnoreCase(genre);
        if(foundBooks.isEmpty())
            throw new BookNotFoundException("Book not found for genre: " + genre);
        return foundBooks;
    }

    @Override
    public List<Book> getBooksByPublishYear(Year year) throws BookNotFoundException {
        List<Book> foundBooks = bookRepository.findBooksByPublishYear(year);
        if(foundBooks.isEmpty())
            throw new BookNotFoundException("Book not found for year: " + year);
        return foundBooks;
    }

    @Override
    public Book getBookByIsbn(String isbn) throws BookNotFoundException {
        return bookRepository.findBookByIsbnIgnoreCase(isbn);
    }

    @Override
    public List<Book> getBooksByLanguage(String language) throws BookNotFoundException {
        List<Book> foundBooks = bookRepository.findBooksByLanguageIgnoreCase(language);
        if(foundBooks.isEmpty())
            throw new BookNotFoundException("Book not found for language: " + language);
        return foundBooks;
    }

    @Override
    public List<Book> getAllBooks() throws BookNotFoundException {
        List<Book> foundBooks = bookRepository.findAll();
        if(foundBooks.isEmpty())
            throw new BookNotFoundException("No books found");
        return foundBooks;
    }

    @Override
    public Boolean checkExistenceOfBook(Book book) {
        return bookRepository.existsById(book.getId());
    }

    @Override
    public Page<Book> getBooksInSortedOrder(Pageable pageable) throws BookNotFoundException {
        return bookRepository.findAll(pageable);
    }


    @Override
    public List<Book> getMostBorrowedBooks() throws BookNotFoundException {
        return List.of();
    }

}
