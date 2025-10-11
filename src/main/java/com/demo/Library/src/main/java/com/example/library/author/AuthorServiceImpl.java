package com.example.library.author;


import com.example.library.book.Book;
import com.example.library.book.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;
    @Autowired
    public AuthorServiceImpl(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    //add author

    @Override
    public Author addNewAuthor(Author newAuthor) throws AuthorNotFoundException {
        Optional<Author> optionalAuthor = authorRepo.findById(newAuthor.getId());
        if(optionalAuthor.isEmpty()) {
           return this.authorRepo.save(newAuthor);
        }
        else{
            throw new AuthorNotFoundException("Author already exists");
        }
    }

    //add book
    @Override
    public Book addBooktoAuthor(Integer authorId,Book book) throws AuthorNotFoundException,BookAlreadyExistsException {
        Optional<Author> author = authorRepo.findById(authorId);
        if(author.isEmpty()) {

            throw new AuthorNotFoundException("Author not found");
        }
        Optional<Book> newBook = this.bookRepo.findById(book.getId());

        Author newAuthor = author.get();
        newAuthor.addBook(book);
        authorRepo.save(newAuthor);
        return book;
    }

    //return list of book - author

    @Override
    public List<Book> getBooksByAuthor(Integer Id) throws AuthorNotFoundException {
        Optional<Author> author = authorRepo.findById(Id);
        if(author.isEmpty()) {
            throw new AuthorNotFoundException("Author not found");
        }
        return author.get().getBookList();
    }
}
