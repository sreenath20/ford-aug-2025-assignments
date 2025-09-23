package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
    @GetMapping("/{id}")
    public Member getMember(@PathVariable Integer id) {
        return memberService.getMember(id);
    }
    @PostMapping("/{memberId}/borrow/{bookId}")
    public Member borrowBook(@PathVariable Integer memberId, @PathVariable Integer bookId) {
        return memberService.borrowBook(memberId, bookId);
    }
    @DeleteMapping("/{memberId}/return/{bookId}")
    public Member returnBook(@PathVariable Integer memberId, @PathVariable Integer bookId) {
        return memberService.returnBook(memberId, bookId);
    }
    @GetMapping("/{id}/books")
    public Set<Book> getBorrowedBooks(@PathVariable Integer id) {
        return memberService.getBorrowBooks(id);
    }
}