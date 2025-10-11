package com.example.library.member;

import com.example.library.book.Book;
import com.example.library.membership_card.MembershipCard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@Entity
public class Member {
    @Id

    private Integer id;
    private String name;
    //@Email(message="it should be valid email") //should have '@' & domain part & local part

    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@gmail\\.com$",
            message="it should be valid email"
    )
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="memberShip",referencedColumnName = "id")

    private MembershipCard membershipCard;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Book> borrowedBooks;

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }



    public Member() {
    }

    public Member(String name, String email) {

        this.name = name;
        this.email = email;

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
