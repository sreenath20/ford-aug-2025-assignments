package com.demo.library.book;

import org.springframework.stereotype.Service;

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

//    @Override
//    public Book addNewBook(Book newBook) throws BookAlreadyExistsException {
//        if(bookRepository.existsById(newBook.getId()))
//            throw new BookAlreadyExistsException("Book already exists for id: " + newBook.getId());
//        return bookRepository.save(newBook);
//    }
}