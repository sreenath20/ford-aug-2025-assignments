package com.example.library.book;

import com.example.library.member.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Member>  getEmployee(String isbn );
    List<Member> getAllBooksById(Integer bookId) throws bookNotFoundException;
    Page<Book> getAllBooks(Pageable pageable,String title);

}
