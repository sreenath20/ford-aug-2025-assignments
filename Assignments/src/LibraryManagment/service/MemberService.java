package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Member;

import java.util.Set;

public interface MemberService {
    Member addMember(Member member);
    Member getMember(Integer id);
    Member borrowBook(Integer memberId, Integer bookId);
    Member returnBook(Integer memberId, Integer bookId);
    Set<Book> getBorrowBooks(Integer memberId);

}
