package com.e_commerce.onlinemart.jpa_mapping_assignment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String title;
    private Integer isbn;

    @ManyToOne
    @JoinColumn(name="bookAuthorId" , referencedColumnName = "authorId")
    private Author author;


    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonIgnore
    private List<Member> borrowedByMembers;


    public Book() {
    }
    public Book(Integer bookId, String title, Integer isbn) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
    }

    public Book(Integer bookId, String title, Integer isbn, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Book(Integer bookId, String title, Integer isbn, Author author, List<Member> borrowedByMembers) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.borrowedByMembers = borrowedByMembers;
    }

    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;

    }
    public String getTitle() {
        return title;
    }
    public  void setTitle(String title) {
        this.title = title;
    }
    public  Integer getIsbn() {
        return isbn;
    }
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Member> getBorrowedByMembers() {
        return borrowedByMembers;
    }

    public void setBorrowedByMembers(List<Member> borrowedByMembers) {
        this.borrowedByMembers = borrowedByMembers;
    }
}
