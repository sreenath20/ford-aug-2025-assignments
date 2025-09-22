package com.e_commerce.onlinemart.jpa_mapping_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {
    @Autowired
    MemberRepo memberRepo;
    @Autowired
    MemberShipCardRepo memberShipCardRepo;

    @Autowired
    BookRepo bookRepo;

    @PostMapping
    public Member addNewMember(@RequestBody Member member) {

        return memberRepo.save(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public Member getMemberById(Integer memberId) throws MemberNotFoundException {
        Optional<Member> foundMember = memberRepo.findById(memberId);
        if (foundMember.isEmpty()) {
            throw new MemberNotFoundException("Member with id " + memberId + " not found.");
        }
        return foundMember.get();
    }

    @PostMapping("/member/{memberId}/borrow/{bookId}")
    public String borrowBookByMember(@PathVariable Integer memberId, @PathVariable Integer bookId)throws MemberNotFoundException,DuplicateBorrowException,ExpiredMemberShipCardException {
        Optional<Member> foundMember = memberRepo.findById(memberId);
        if (foundMember.isEmpty()) {
            throw new MemberNotFoundException("Member with id " + memberId + " not found.");
        }
        Member member = foundMember.get();

        LocalDate now = LocalDate.now();
        MemberShipCard memberShipCard = member.getMemberShipCard();
        if (memberShipCard.getExpiryDate().isAfter(now)) {
            throw new ExpiredMemberShipCardException("Membership card is expired for member with id " + memberId);

        }
        List<Book> borrowedBooks = member.getBorrowedBooks();
        for (Book book : borrowedBooks) {
            if (book.getBookId() == bookId) {
              throw new DuplicateBorrowException("Book with id " + bookId + " is already borrowed by member with id " + memberId);
            }
        }
        Book bookToBorrow = new Book();
        bookToBorrow.setBookId(bookId);
        borrowedBooks.add(bookToBorrow);
        member.setBorrowedBooks(borrowedBooks);
        memberRepo.save(member);
        return "Book with id " + bookId + " is successfully borrowed by member with id " + memberId;
    }

    @GetMapping("members/{memberId}/books")
    public List<Book> getAllBooksBorrowedByMember(@PathVariable Integer memberId) throws MemberNotFoundException {
        Optional<Member> foundMember = memberRepo.findById(memberId);
        if (foundMember.isEmpty()) {
            throw new MemberNotFoundException("Member with id " + memberId + " not found.");
        }
        return foundMember.get().getBorrowedBooks();
    }

    @GetMapping("/books/{bookId}/members")
    public List<Member> getAllMembersWhoBorrowedBook(@PathVariable Integer bookId)
            throws MemberNotFoundException,BookNotFoundException {
        if(!bookRepo.existsById(bookId)) {
            throw new BookNotFoundException("Book with id " + bookId + " not found .");
        }

        List<Member> allMembers = memberRepo.findAll();
        for (Member member : allMembers) {
            List<Book> borrowedBooks = member.getBorrowedBooks();
            for (Book book : borrowedBooks) {
                if (book.getBookId() == bookId) {
                    return allMembers;
                }
            }
        }
        throw new MemberNotFoundException("No members have borrowed the book with id " + bookId);
    }

}
