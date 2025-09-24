package com.demo.library.member;

import com.demo.library.book.Book;
import com.demo.library.membershipcard.MembershipCard;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String email;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn
    private MembershipCard membershipCard;

    @ManyToMany
    private List<Book> borrowedBooks;


    public Member() {
    }

    public Member(Integer id, String name, String email, MembershipCard membershipCard) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.membershipCard = membershipCard;
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
}
