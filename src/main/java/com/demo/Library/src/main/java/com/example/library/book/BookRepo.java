package com.example.library.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findByISBN(String ISBN);
    //Page<Book> findByBorrowedByMemberId(Integer memberId, Pageable pageable);
    @Query("SELECT m.borrowedBooks FROM Member m WHERE m.id = :memberId")
    Page<Book> findBorrowedBooksByMemberId(@Param("memberId") Integer memberId, Pageable pageable);
    Page<Book> findAll(Pageable pageable);
    Page<Book> findByTitle(String title, Pageable pageable);
}
