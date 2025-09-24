package com.demo.library.author;

import com.demo.library.book.Book;
import com.demo.library.book.BookAlreadyExistsException;
import com.demo.library.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final BookService bookService;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository, BookService bookService) {
        this.authorRepository = authorRepository;
        this.bookService = bookService;
    }

    @Override
    public Author addNewAuthor(Author newAuthor) throws AuthorException {
        if (authorRepository.existsById(newAuthor.getId())) {
            throw new AuthorException("Author with id " + newAuthor.getId() + " already exists");
        }
        return authorRepository.save(newAuthor);
    }

    @Override
    public Book addBookForAuthor(Integer authId, Book newBook) throws RuntimeException {

        Author foundAuthor = authorRepository.findById(authId)
                .orElseThrow(() -> new AuthorException("Author with id " + authId + " does not found"));

        newBook.setAuthor(foundAuthor);
//        to author
        foundAuthor.getBooks().add(newBook);
        authorRepository.save(foundAuthor);

        return bookService.getBookById(newBook.getId());
    }

    @Override
    public List<Book> getBooksByAuthorId(Integer authId) throws RuntimeException {
        Author foundAuthor = authorRepository.findById(authId)
                .orElseThrow(() -> new AuthorException("Author with id " + authId + " does not found"));
        if(foundAuthor.getBooks().isEmpty())
            throw new AuthorException("Author with id " + authId + " does not publish any books");
        return foundAuthor.getBooks();
    }

}