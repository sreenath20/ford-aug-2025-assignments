package com.example.mapping_assignment.mapping;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Books {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Long isbn;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnore
    private Author author;

    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonIgnore
    private List<Member> memberList = new ArrayList<>();


    public Books() {
    }

    public Books(Integer id, String title, Long isbn, Double price, Author author, List<Member> memberList) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
        this.memberList = memberList;
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

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public List<Member> getMemberList() {
        return memberList;
    }
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
