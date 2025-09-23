package com.example.demo.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String isbn;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    @ManyToMany(mappedBy= "borrowedBooks")
    private Set<Member> borrowedByMembers=new HashSet<>();

    public Book() {
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

    public Set<Member> getBorrowedByMembers() {
        return borrowedByMembers;
    }

    public void setBorrowedByMembers(Set<Member> borrowedByMembers) {
        this.borrowedByMembers = borrowedByMembers;
    }
}
