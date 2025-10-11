package com.example.library.member;

import com.example.library.book.Book;
import com.example.library.book.BookRepo;
import com.example.library.book.BorrowingLimitExceededException;
import com.example.library.book.bookNotFoundException;
import com.example.library.membership_card.ExpiredMemberShipException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepo memberRepo;
    private BookRepo bookRepo;
    public MemberServiceImpl(MemberRepo memberRepo, BookRepo bookRepo) {
        this.memberRepo = memberRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public Member registerNewMember(Member newMember) throws MemberAlreadyExistsException {
        if(memberRepo.findByEmail(newMember.getEmail())==null){
            return this.memberRepo.save(newMember);
        }
        else{
            throw new MemberAlreadyExistsException("Member already exists");
        }
    }

    @Override
    public Member getMemberByEmailId(String email) throws MemberNotFoundException {
        if(memberRepo.findByEmail(email)!=null){
            return memberRepo.findByEmail(email);
        }
        else{
            throw new MemberNotFoundException("Member not found");
        }
    }

    @Override
    public Member borrowBookByMemberEmailId(Integer memberId, Integer bookId) throws MemberNotFoundException,bookNotFoundException,ExpiredMemberShipException,BorrowingLimitExceededException {
        Optional<Member> foundMember=this.memberRepo.findById(memberId);
        Optional<Book> foundBook=this.bookRepo.findById(bookId);
        if(foundMember.isEmpty()){
            throw new MemberNotFoundException("Member not found");
        }
        if(foundBook.isEmpty()){
            throw new bookNotFoundException("Book NOt found");
        }
        Member members=foundMember.get();
        if(members.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())){
            throw new ExpiredMemberShipException("You are card expired..!!");
        }
        Book books=foundBook.get();

        if(books.getBorrowedByMembers().size()>5){
            throw new ExpiredMemberShipException("Borrowing limit exceeded");
        }
        if(members.getBorrowedBooks().contains(books)){
            throw new BorrowingLimitExceededException("you may crossed");
        }
        members.getBorrowedBooks().add(books);
        this.memberRepo.save(members);

        return members;

    }

    @Override
    public List<Book> getAllbooks(Integer memberId)  throws MemberNotFoundException{

        return this.memberRepo.findById(memberId).get().getBorrowedBooks();

    }

    @Override
    public Book deleteBookById(Integer memberId, Integer bookId) throws MemberNotFoundException, bookNotFoundException {
        Member member=this.memberRepo.findById(memberId).get();
        Book book=this.bookRepo.findById(bookId).get();
        if(member==null){
            throw new MemberNotFoundException("Member not found");
        }
        if(book==null){
            throw new bookNotFoundException("Book NOT found");
        }
        member.getBorrowedBooks().remove(book);
        this.memberRepo.save(member);
        return book;
    }

    @Override
    public List<Book> getAllBooksById(Pageable pageable,Integer memberId) throws MemberNotFoundException {
        Member member=this.memberRepo.findById(memberId).get();
        if(member==null){
            throw new MemberNotFoundException("Member not found!!");
        }

        return this.bookRepo.findBorrowedBooksByMemberId(memberId,pageable).getContent();
    }
}
