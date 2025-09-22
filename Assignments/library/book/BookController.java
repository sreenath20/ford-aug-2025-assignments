package com.demo.library.book;

import com.demo.library.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
