package com.demo.library.book;

import com.demo.library.author.Author;
import com.demo.library.member.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String isbn;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Author author;

    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonIgnore
    private List<Member> borrowedByMembers;

    public Book() {
    }

    public Book(Integer id, String title, String isbn, Author author, List<Member> borrowedByMembers) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.borrowedByMembers = borrowedByMembers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
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
