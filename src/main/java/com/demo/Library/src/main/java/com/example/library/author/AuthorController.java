package com.example.library.author;

import com.example.library.book.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/athor")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping("author")
    public Author addAuthor(@RequestBody @Valid Author author) throws AuthorNotFoundException{
        return this.authorService.addNewAuthor(author);
    }

    @PutMapping("{authorId}")
    public Book addBook(@RequestBody Book book,Integer authorId) throws AuthorNotFoundException,BookAlreadyExistsException{
        return this.authorService.addBooktoAuthor(authorId,book);
    }

    @GetMapping("{authorId}")
    public List<Book> getBooks(@PathVariable Integer authorId) throws AuthorNotFoundException{
        return this.authorService.getBooksByAuthor(authorId);
    }

}

