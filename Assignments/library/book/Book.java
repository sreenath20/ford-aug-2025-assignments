package com.demo.library.book;

import com.demo.library.author.Author;
import com.demo.library.member.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Book {

    @Id
    private Integer id;

    private String title;

    @Column(unique = true)
    private String isbn;

    private String genre;

    private String language;

    private Year publishYear;

    @ManyToOne
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "BorrowedBooks",
            joinColumns = @JoinColumn(name = "Book_Id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Member_Id", referencedColumnName = "id")
    )
    @JsonIgnore
    private List<Member> borrowedByMembers = new ArrayList<>();

    public Book() {}

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Year getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Year publishedYear) {
        this.publishYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn);
    }
}
