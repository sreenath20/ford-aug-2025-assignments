package com.demo.library.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Year;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findBooksByGenreIgnoreCase(String genre);

    List<Book> findBooksByPublishYear(Year year);

    Book findBookByIsbnIgnoreCase(String isbn);

    List<Book> findBooksByLanguageIgnoreCase(String language);


    Page<Book> findAll(Pageable pageable);


}
