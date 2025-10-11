package com.example.library.book;

import com.example.library.member.Member;
import com.example.library.member.MemberRepo;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private MemberRepo memberRepo;
    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(MemberRepo memberRepo, BookRepo bookRepo) {
        this.memberRepo = memberRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Member> getEmployee(String isbn) {
        return this.bookRepo.findByISBN(isbn).getBorrowedByMembers();
    }

    @Override
    public List<Member> getAllBooksById(Integer bookId) throws bookNotFoundException {

        Book foundBook = bookRepo.findById(bookId).get();
        if (foundBook == null) {
            throw new bookNotFoundException("Book is not found");
        }
        return foundBook.getBorrowedByMembers();
    }

    @Override
    public Page<Book> getAllBooks(Pageable pageable, String title) {

        if (title == null) {
            return bookRepo.findAll(pageable);
        }
        else{
            return bookRepo.findByTitle(title,pageable);
        }
    }


}
