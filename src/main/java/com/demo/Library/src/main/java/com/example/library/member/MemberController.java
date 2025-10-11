package com.example.library.member;

import com.example.library.book.Book;
import com.example.library.book.BorrowingLimitExceededException;
import com.example.library.book.bookNotFoundException;
import com.example.library.membership_card.ExpiredMemberShipException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member registerNewMember(@RequestBody Member newMember) throws MemberAlreadyExistsException {
        return this.memberService.registerNewMember(newMember);
    }

    @GetMapping("/{email}")
    public Member getMemberByEmail(@PathVariable String email) throws MemberNotFoundException {
        return this.memberService.getMemberByEmailId(email);
    }

    @PostMapping("{memberId}/borrow/{bookId}")
    public Member borrowBookByMember(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException,
            bookNotFoundException,
            ExpiredMemberShipException,
            BorrowingLimitExceededException {
        return this.memberService.borrowBookByMemberEmailId(memberId,bookId);
    }
    @GetMapping("/{page}/{size}/{memberId}books")
    public List<Book> getborrowed(@PathVariable Integer page, @PathVariable Integer size,@PathVariable Integer memberId) throws  MemberNotFoundException {

        return this.memberService.getAllBooksById(PageRequest.of(page, size),memberId);
    }

    @DeleteMapping("/{memberId}/Book/{bookId}")
    public Book deleteBook(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException,bookNotFoundException {
        return this.memberService.deleteBookById(memberId,bookId);
    }





}
