package com.demo.library.member;

import com.demo.library.book.Book;

import java.util.List;

public interface MemberService {

    Member registerNewMember(Member newMember) throws MemberException;

    Member getMemberById(Integer memId) throws MemberNotFoundException;

    Member borrowBookById(Integer memId, Integer bookId) throws RuntimeException;

    Member returnBookById(Integer memId, Integer bookId) throws  RuntimeException;

    List<Book> getBorrowedBooksByMemberId(Integer memId) throws MemberException;
}
