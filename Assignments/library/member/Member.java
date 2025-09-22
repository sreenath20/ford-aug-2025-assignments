package com.demo.library.member;


import com.demo.library.book.Book;
import com.demo.library.membershipCard.MembershipCard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {

    @Id
    private Integer id;

    private String name;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private MembershipCard membershipCard;

    @ManyToMany(mappedBy = "borrowedByMembers")
    @JsonIgnore
    private List<Book> borrowedBooks;

    public Member() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MembershipCard getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(MembershipCard membershipCard) {
        this.membershipCard = membershipCard;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> books) {
        this.borrowedBooks = books;
    }
}
