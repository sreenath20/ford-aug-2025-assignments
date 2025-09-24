package com.example.mapping_assignment.mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;

public interface BooksRepo extends JpaRepository<Books, Integer> {
    @NativeQuery("SELECT * FROM Books b WHERE b.isbn=?1")
    List<Books> findByIsbn(Long isbn);
}
