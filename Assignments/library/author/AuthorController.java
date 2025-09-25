package com.demo.library.author;

import com.demo.library.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService  authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author newAuthor) {
        return authorService.addNewAuthor(newAuthor);
    }

    @PostMapping("/{authId}/books")
    public Book addBookToAuthor(@PathVariable("authId") Integer authId, @RequestBody Book newBook) {
        return authorService.addBookForAuthor(authId, newBook);
    }

    @GetMapping("/{authId}/books")
    public List<Book> getBooksByAuthorId(@PathVariable("authId") Integer authId) {
        return authorService.getBooksByAuthorId(authId);
    }

    @GetMapping("/name/{authName}")
    public Author getAuthorByName(@PathVariable("authName") String authName) {
        return authorService.getAuthorByName(authName);
    }

    @GetMapping("/all")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

}
