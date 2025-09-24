package com.demo.library.membershipcard;

import com.demo.library.member.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class MembershipCard {


    @Id
    @GeneratedValue
    private Integer id;
    private Integer cardumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    @OneToOne(mappedBy = "membershipCard")
    @JsonIgnore
    private Member member;

    public MembershipCard() {
    }

    public MembershipCard(Integer id, Integer cardumber, LocalDate issueDate, LocalDate expiryDate, Member member) {
        this.id = id;
        this.cardumber = cardumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardumber() {
        return cardumber;
    }

    public void setCardumber(Integer cardumber) {
        this.cardumber = cardumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
