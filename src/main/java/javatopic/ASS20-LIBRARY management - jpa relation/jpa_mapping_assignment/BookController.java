package com.e_commerce.onlinemart.jpa_mapping_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

    @Autowired
    AuthorRepo authorRepo;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        if (book.getAuthor() != null && book.getAuthor().getAuthorId() != null) {
            Author existingAuthor = authorRepo.findById(book.getAuthor().getAuthorId())
                    .orElseThrow(() -> new RuntimeException("Author with ID " +
                            book.getAuthor().getAuthorId() + " not found"));
            book.setAuthor(existingAuthor);
        }
//        Author createdAuthor = addAuthor(book.getAuthor());
//        book.setAuthor(createdAuthor);

        return bookRepo.save(book);

    }

//    @GetMapping("author/{id}/book")
//    public List<Book> getBooksByAuthorId(@PathVariable Integer authorId) {
//        return authorRepo.findByAuthorId(authorId);
//
//    }
//
    @PostMapping("/author")
    public Author addAuthor(@RequestBody Author author) {
        author.setAuthorId(null);
        return authorRepo.save(author);

    }

    @GetMapping("/allAuthors")
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("book/author/{id}")
    public List<Book> getBookByAuthorId(@PathVariable Integer id) throws AuthorNotFoundException {
        if(!authorRepo.existsById(id)){
            throw new AuthorNotFoundException("Author with id " + id + " not found.");
        }
        return bookRepo.findBookByAuthorId(id);
    }
    @PostMapping("book/author/{id}")
    public Book addBookToAuthor(@RequestBody Book book, @PathVariable Integer id) throws AuthorNotFoundException, BookAlreadyExistsException {
        Author foundAuthor = authorRepo.findById(id).orElseThrow(() -> new AuthorNotFoundException("Author with id " + id + " not found."));
        if(bookRepo.existsByIsbn(book.getIsbn())){
            throw new BookAlreadyExistsException("Book with ISBN " + book.getIsbn() + " already exists.");
        }

        book.setAuthor(foundAuthor);
        book.setBookId(null);
        return bookRepo.save(book);
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthor(@PathVariable Integer id) {
        authorRepo.deleteById(id);
        return "Author with id " + id + " deleted successfully.";
    }

//    @PostMapping("author/{id}/book")
//    public Author addBookToAuthor(@RequestBody Book book, int id) throws AuthorNotFoundException {
//        Author foundAuthor = authorRepo.findById(id).orElseThrow(() -> new AuthorNotFoundException("Author with id " + id + " not found."));
//        foundAuthor.getBooks().add(book);
//        book.setAuthor(foundAuthor);
//        authorRepo.save(foundAuthor);
//        return foundAuthor;
//    }





}
