package com.example.mapping_assignment.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private MemberRepo memberRepo;

    private BooksRepo booksRepo;
    @Autowired
    public BookController(MemberRepo memberRepo, BooksRepo booksRepo) {
        this.memberRepo = memberRepo;
        this.booksRepo = booksRepo;
    }

    @GetMapping("/{id}/members")
    public List<Member> getMemberByBoodId(@PathVariable Integer id) throws BookNotFoundException {
        Books foundBook = this.booksRepo.findById(id).orElseThrow(()->new BookNotFoundException("Book with id "+id+" not found"));
        return foundBook.getMemberList();
    }


}
