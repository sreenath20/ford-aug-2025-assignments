package com.example.mapping_assignment.mapping;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private BooksRepo booksRepo;
    private  AuthorRepo authorRepo;

    @Autowired
    public AuthorController(BooksRepo booksRepo, AuthorRepo authorRepo) {
        this.booksRepo = booksRepo;
        this.authorRepo = authorRepo;
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorRepo.save(author);
    }

    @PostMapping("/{id}/books")
    public Books addBooks(@PathVariable Integer id, @RequestBody Books books) throws AuthorNotFOundException,BookAlreadyExistsException {
        List<Books> existingBookWithSameIsbn = booksRepo.findByIsbn(books.getIsbn());
        if(!existingBookWithSameIsbn.isEmpty()){
            throw new BookAlreadyExistsException("Book with ISBN "+books.getIsbn()+" already exists");
        }
        Author author = authorRepo.findById(id).orElseThrow(() -> new AuthorNotFOundException("Author with id " + id + " not found"));
        books.setAuthor(author);
        return booksRepo.save(books);
    }

    @GetMapping("/{id}/books")
    public List<Books> getAllBooksByAuthor(@PathVariable Integer id) throws AuthorNotFOundException {
        Author author = authorRepo.findById(id).orElseThrow(() -> new AuthorNotFOundException("Author with id " + id + " not found"));
        return author.getBooksList();
    }

}
