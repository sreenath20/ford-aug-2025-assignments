package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Member;
import com.example.demo.exception.*;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepo;
    @Autowired
    private BookRepository bookRepo;
    @Override
    public Member addMember(Member member) {
        if (member.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())) {
            throw new InvalidCardException("Membership card already expired.");
        }
        member.getMembershipCard().setMember(member);
        return memberRepo.save(member);
    }
    @Override
    public Member getMember(Integer id) {
        return memberRepo.findById(id)
                .orElseThrow(() -> new MemberNotFoundException("Member not found: " + id));
    }
    @Override
    public Member borrowBook(Integer memberId, Integer bookId) {
        Member member = getMember(memberId);
        if (member.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())) {
            throw new ExpiredMembershipException("Membership expired.");
        }
        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found: " + bookId));
        if (book.getBorrowedByMembers().size() >= 5) {
            throw new BorrowingLimitExceededException("Book already borrowed by 5 members.");
        }
        if (member.getBorrowedBooks().contains(book)) {
            throw new DuplicateBorrowException("Member already borrowed this book.");
        }
        member.getBorrowedBooks().add(book);
        book.getBorrowedByMembers().add(member);
        return memberRepo.save(member);
    }
    @Override
    public Member returnBook(Integer memberId, Integer bookId) {
        Member member = getMember(memberId);
        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found: " + bookId));
        member.getBorrowedBooks().remove(book);
        book.getBorrowedByMembers().remove(member);
        return memberRepo.save(member);
    }
    @Override
    public Set<Book> getBorrowBooks(Integer memberId) {
        return getMember(memberId).getBorrowedBooks();
    }
}
