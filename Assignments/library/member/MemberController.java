package com.demo.library.member;

import com.demo.library.book.Book;
import com.demo.library.book.BorrowingLimitExceedException;
import com.demo.library.book.DuplicateBorrowException;
import com.demo.library.membershipCard.ExpiredMembershipException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public Member registerNewMember(@RequestBody Member newMember) {
        return memberService.registerNewMember(newMember);
    }

    @GetMapping("/{memId}")
    public Member getMember(@PathVariable("memId") Integer memId) {
        return memberService.getMemberById(memId);
    }
    
    @PostMapping("/{memId}/borrow/{bookId}")
    public Member borrowBookById(@PathVariable("memId") Integer memId, @PathVariable("bookId") Integer bookId) {
        return memberService.borrowBookById(memId,bookId);
    }
    
    @GetMapping("/{memId}/books")
    public List<Book> getBooks(@PathVariable("memId") Integer memId) {
        return memberService.getBorrowedBooksByMemberId(memId);
    }

    @DeleteMapping("/{memId}/return/{bookId}")
    public Member returnBookById(@PathVariable("memId") Integer memId, @PathVariable("bookId") Integer bookId) {
        return memberService.returnBookById(memId, bookId);
    }
}
