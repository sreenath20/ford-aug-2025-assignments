package com.e_commerce.onlinemart.jpa_mapping_assignment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

    List<Book> findByAuthorId(Integer authorId);
}
