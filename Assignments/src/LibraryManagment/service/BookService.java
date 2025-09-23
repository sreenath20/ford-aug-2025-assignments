package com.example.demo.service;

import com.example.demo.entity.Member;

import java.util.Set;

public interface BookService {
    Set<Member> getMembersByBook(Integer bookId);
}
