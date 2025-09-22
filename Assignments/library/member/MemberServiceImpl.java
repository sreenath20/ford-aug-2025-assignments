package com.demo.library.member;

import com.demo.library.book.Book;
import com.demo.library.book.BookService;
import com.demo.library.book.BorrowingLimitExceedException;
import com.demo.library.book.DuplicateBorrowException;
import com.demo.library.membershipCard.ExpiredMembershipException;
import com.demo.library.membershipCard.InvalidCardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final BookService bookService;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository, BookService bookService) {
        this.memberRepository = memberRepository;
        this.bookService = bookService;
    }

    @Override
    public Member registerNewMember(Member newMember) throws MemberException {

        if(memberRepository.existsById(newMember.getId()))
            throw new MemberException("Member already exists for id " + newMember.getId());

        if(newMember.getMembershipCard() != null && newMember.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())){
                throw new InvalidCardException("Membership card has expired ");
        }
        return memberRepository.save(newMember);
    }

    @Override
    public Member getMemberById(Integer memId) throws MemberNotFoundException {
        return memberRepository.findById(memId)
                .orElseThrow(()->new MemberNotFoundException("Member not found for id "+memId));
    }

    @Override
    public Member borrowBookById(Integer memId, Integer bookId) throws RuntimeException {
        Member borrower = getMemberById(memId);
        Book borrowBook = bookService.getBookById(bookId);

        if(borrowBook.getBorrowedByMembers().size() >= 5)
            throw new BorrowingLimitExceedException("Borrowing limit exceeded, already 5 members borrowed this book.");

        if(borrower.getBorrowedBooks().contains(borrowBook))
            throw  new DuplicateBorrowException("Duplicate book borrowing, member has already been borrowed this book.");

        if(borrower.getMembershipCard().getExpiryDate().isBefore(LocalDate.now()))
            throw new ExpiredMembershipException("Membership card has expired .");

        borrowBook.getBorrowedByMembers().add(borrower);
        borrower.getBorrowedBooks().add(borrowBook);

        return memberRepository.save(borrower);
    }

    @Override
    public Member returnBookById(Integer memId, Integer bookId) throws RuntimeException {
        Member borrower = getMemberById(memId);
        Book borrowBook = bookService.getBookById(bookId);

        if(! borrower.getBorrowedBooks().contains(borrowBook))
            throw new MemberException("Book not borrowed by member.");

        borrower.getBorrowedBooks().remove(borrowBook);
        borrowBook.getBorrowedByMembers().remove(borrower);

        return memberRepository.save(borrower);
    }

    @Override
    public List<Book> getBorrowedBooksByMemberId(Integer memId) throws MemberException {
        Member foundMember = getMemberById(memId);
        if(foundMember.getBorrowedBooks().isEmpty())
            throw new MemberException("Member not borrowed any books.");
        return foundMember.getBorrowedBooks();
    }
}
