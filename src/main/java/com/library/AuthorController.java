package com.example.jpamappingassignment.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return this.authorRepository.save(author);
    }

    @PostMapping("/{id}/books")
    public Book createBook(@PathVariable int id, @RequestBody Book newBook) throws AuthorNotFoundException, BookAlreadyExistsException {
        Author author = this.authorRepository.findById(id).orElseThrow(()-> new AuthorNotFoundException("Author not found"));

        for(Author existingAuthor: this.authorRepository.findAll()){
            boolean bookExists = existingAuthor.getBooks().stream()
                    .anyMatch(book -> Objects.equals(book.getIsbn(), newBook.getIsbn()) || Objects.equals(book.getTitle(), newBook.getTitle()));

            if(author.equals(existingAuthor)){
                if (bookExists) {
                    throw new BookAlreadyExistsException("Book with this ISBN or title already exists for the same author.");
                }
            }else{
                if (bookExists) {
                    throw new BookAlreadyExistsException("Book with this ISBN or title already exists for another author.");
                }
            }

        }

        newBook.setAuthor(author);
        return this.bookRepository.save(newBook);

    }

    @GetMapping("/{id}/books")
    public List<Book> getBooks(@PathVariable int id) throws AuthorNotFoundException {
        Author author = this.authorRepository.findById(id).orElseThrow(()-> new AuthorNotFoundException("Author not found"));
        return author.getBooks();
    }

}
