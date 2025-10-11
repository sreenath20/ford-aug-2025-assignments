package com.example.library.member;

import com.example.library.book.Book;
import com.example.library.book.BorrowingLimitExceededException;
import com.example.library.book.bookNotFoundException;
import com.example.library.membership_card.ExpiredMemberShipException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberService {
    Member registerNewMember(Member newMember) throws MemberAlreadyExistsException;

    Member getMemberByEmailId(String email) throws MemberNotFoundException;
    Member borrowBookByMemberEmailId(Integer memberId, Integer bookId) throws MemberNotFoundException, bookNotFoundException, ExpiredMemberShipException, BorrowingLimitExceededException;
  List<Book> getAllbooks(Integer memberId) throws MemberNotFoundException;
    Book deleteBookById(Integer memberId,Integer bookId) throws MemberNotFoundException,bookNotFoundException;
    List<Book> getAllBooksById(Pageable pageable,Integer memberId) throws MemberNotFoundException;
}
