package com.demo.library.book;

import com.demo.library.author.Author;
import com.demo.library.member.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Book {

    @Id
    private Integer id;

    private String title;

    @Column(unique = true)
    private Long isbn;

    @ManyToOne
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "BorrowedBooks",
            joinColumns = @JoinColumn(name = "BooK_Id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Member_Id", referencedColumnName = "id")
    )
    private List<Member> borrowedByMembers;

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

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn);
    }
}
