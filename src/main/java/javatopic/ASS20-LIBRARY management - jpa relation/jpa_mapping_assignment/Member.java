package com.e_commerce.onlinemart.jpa_mapping_assignment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String memberName;
    private String memberEmail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MemberCardId", referencedColumnName = "cardId")
    private MemberShipCard memberShipCard;


    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "BorrowedBooks",
            joinColumns = @JoinColumn(name = "memberId"),
            inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private List<Book> borrowedBooks;

    public Member() {
    }
    public Member(int memberId, String memberName, String memberEmail, MemberShipCard memberShipCard) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberShipCard = memberShipCard;
    }

    public Member(int memberId, String memberName, String memberEmail, MemberShipCard memberShipCard, List<Book> borrowedBooks) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberShipCard = memberShipCard;
        this.borrowedBooks = borrowedBooks;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;

    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public MemberShipCard getMemberShipCard() {
        return memberShipCard;
    }

    public void setMemberShipCard(MemberShipCard memberShipCard) {
        this.memberShipCard = memberShipCard;
    }

    public List<Book> getBorrowedBooks() {

        return borrowedBooks;

    }
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

}
