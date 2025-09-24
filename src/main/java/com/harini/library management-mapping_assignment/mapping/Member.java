package com.example.mapping_assignment.mapping;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private MembershipCard membershipCard;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "member_books",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Books> borrowedBooks = new ArrayList<>();
    public Member() {
    }

    public Member(Integer id, String name, MembershipCard membershipCard, List<Books> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.membershipCard = membershipCard;
        this.borrowedBooks = borrowedBooks;
    }

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

    public MembershipCard getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(MembershipCard membershipCard) {
        this.membershipCard = membershipCard;
    }

    public List<Books> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Books> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
