package com.example.jpamappingassignment.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MembershipCardRepository membershipCardRepository;

    //MEMBERSHIP CARD LOGIC

    @PostMapping
    public Member createNewMember(@RequestBody Member member) throws InvalidCardException {
        if(member.getMembershipCard().getExpiryDate().before(new Date())) {
            throw new InvalidCardException("CARD EXPIRED");
        }
        return this.memberRepository.save(member);
    }

    @GetMapping("/{id}")
    public Member findMemberById(@PathVariable Integer id) throws MemberNotFoundException {
        Member member = this.memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("Member not found for get method"));
        return member;
    }

    //BOOK BORROWING LOGIC

    @PostMapping("/{memberId}/borrow/{bookId}")
    public Book borrowBook(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException, BookNotFoundException, ExpiredMembershipException, DuplicateBorrowException, BorrowingLimitExceededException {
        Member member = this.memberRepository.findById(memberId).orElseThrow(() -> new MemberNotFoundException("Member not found for get method"));
        Book book = this.bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book not found"));
        if(member.getMembershipCard().getExpiryDate().before(new Date())) {
            throw new ExpiredMembershipException("Membership expired");
        }
        if(member.getBooks().contains(book)) {
            throw new DuplicateBorrowException("Member already borrowed book");
        }
        if(book.getMembers().size()==5) {
            throw new BorrowingLimitExceededException("Book already borrowed by 5 members");
        }
        book.getMembers().add(member);
        member.getBooks().add(book);
        this.memberRepository.save(member);
        return this.bookRepository.save(book);
    }

    @DeleteMapping("{memberId}/return/{bookId}")
    public Book returnBook(@PathVariable Integer memberId, @PathVariable Integer bookId) throws MemberNotFoundException, BookNotFoundException {
        Member member = this.memberRepository.findById(memberId).orElseThrow(() -> new MemberNotFoundException("Member not found for get method"));
        Book book = this.bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book not found"));
        book.getMembers().remove(member);
        member.getBooks().remove(book);
        this.memberRepository.save(member);
        return this.bookRepository.save(book);
    }
    
    @GetMapping("/{id}/books")
    public List<Book> getBooksByMemberId(@PathVariable Integer id) throws MemberNotFoundException {
        Member member = this.memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("Member not found for get method"));
        return member.getBooks();
    }

}
