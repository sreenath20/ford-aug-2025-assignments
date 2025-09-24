package com.example.mapping_assignment.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private MembershipCardRepo membershipCardRepo;
    private MemberRepo memberRepo;
    private BooksRepo booksRepo;

    @Autowired
    public  MemberController(MembershipCardRepo membershipCardRepo, MemberRepo memberRepo, BooksRepo booksRepo) {
        this.membershipCardRepo = membershipCardRepo;
        this.memberRepo = memberRepo;
        this.booksRepo = booksRepo;
    }

    @PostMapping
    public Member addMember(@RequestBody Member member) throws InvalidCardException {
        if(new Date(member.getMembershipCard().getExpiryDate()).before(new Date())){
            throw new InvalidCardException("Membership card is expired");

        }
        return this.memberRepo.save(member);
    }


    @GetMapping("/{id}")
    public Member getMember(@PathVariable Integer id) throws MemberNotFoundException {
        return this.memberRepo.findById(id).orElseThrow(()->new MemberNotFoundException("Member with id "+id+" not found"));
    }

    @PostMapping("/{memberId}/borrow/{bookId}")
    public Member borrowBookByMember(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException,BookNotFoundException,BorrowingLimitExceededException,DuplicateBorrowException,InvalidCardException {
        Member member = this.memberRepo.findById(memberId).orElseThrow(()->new MemberNotFoundException("Member with id "+memberId+" not found"));
        if(new Date(member.getMembershipCard().getExpiryDate()).before(new Date())){
            throw new InvalidCardException("Membership card is expired");

        }
        if(member.getBorrowedBooks().size()>5){
            throw new BorrowingLimitExceededException("Member with id "+memberId+" has exceeded the borrowing limit");
        }
        Books book = this.booksRepo.findById(bookId).orElseThrow(()->new BookNotFoundException("Book with id "+bookId+" not found"));
        if(member.getBorrowedBooks().contains(book)){
            throw new DuplicateBorrowException("Member with id "+memberId+" has already borrowed the book with id "+bookId);
        }
        member.getBorrowedBooks().add(book);
        return this.memberRepo.save(member);
    }

    @GetMapping("/{id}/books")
    public List<Books> getBooksByMemberId(@PathVariable Integer id) throws MemberNotFoundException {
        Member foundMember = this.memberRepo.findById(id).orElseThrow(()->new MemberNotFoundException("Member with id "+id+" not found"));
        return foundMember.getBorrowedBooks();
    }

    @DeleteMapping("/{memberId}/return/{bookId}")
    public Books deleteBookFromMember(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException, BookNotFoundException {
        Member foundMember = this.memberRepo.findById(memberId).orElseThrow(()->new MemberNotFoundException("Member with id "+memberId+" not found"));
        Books foundBook = this.booksRepo.findById(bookId).orElseThrow(()->new BookNotFoundException("Book with id "+bookId+" not found"));
        foundMember.getBorrowedBooks().remove(foundBook);
        this.memberRepo.save(foundMember);
        return foundBook;
    }







}
