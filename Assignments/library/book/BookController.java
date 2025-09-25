package com.demo.library.book;

import com.demo.library.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}/members")
    public List<Member> getMembers(@PathVariable Integer bookId){

        Book foundBook = bookService.getBookById(bookId);
        if(foundBook.getBorrowedByMembers().isEmpty())
            throw new BookException("Book has not borrowed by any members.");

        return foundBook.getBorrowedByMembers();
    }

    @GetMapping("genre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre){
        return bookService.getBooksByGenre(genre);
    }

    @GetMapping("publishYear/{year}")
    public List<Book> getBooksByPublishYear(@PathVariable Year  year){
        return bookService.getBooksByPublishYear(year);
    }

    @GetMapping("isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn);
    }

    @GetMapping("language/{language}")
    public List<Book> getBookByLanguage(@PathVariable String language){
        return bookService.getBooksByLanguage(language);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/sorted")
    public ResponseEntity<Page<Book>> getBooksInSortedOrder(@PageableDefault(page = 0, size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.ok(bookService.getBooksInSortedOrder(pageable));
    }

    @GetMapping("/most-borrowed")
    public List<Book> getMostBorrowedBooks(){
        return bookService.getMostBorrowedBooks();
    }


}
