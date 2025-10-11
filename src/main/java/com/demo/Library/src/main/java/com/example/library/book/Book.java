package com.example.library.book;

import com.example.library.author.Author;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import com.example.library.member.Member;

@Entity
public class Book {
    @Id

    private Integer id;
    private String title;
    private String ISBN;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    @JsonIgnore
    private Author author;

    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonIgnore
    private List<Member> borrowedByMembers;

    public List<Member> getBorrowedByMembers() {
        return borrowedByMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ISBN);
    }

    public void setBorrowedByMembers(List<Member> borrowedByMembers) {
        this.borrowedByMembers = borrowedByMembers;
    }

    public Book(Integer id, String title, String ISBN) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
    }

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
