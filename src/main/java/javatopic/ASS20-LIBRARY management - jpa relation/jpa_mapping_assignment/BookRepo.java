package com.e_commerce.onlinemart.jpa_mapping_assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface BookRepo extends JpaRepository<Book, Integer> {

    @Query("SELECT b FROM Book b WHERE b.author.authorId = ?1")
    List<Book> findBookByAuthorId(Integer authorId);



    boolean existsByIsbn(Integer isbn);


    //List<Book> findByAuthorId(Integer authorId);
}
