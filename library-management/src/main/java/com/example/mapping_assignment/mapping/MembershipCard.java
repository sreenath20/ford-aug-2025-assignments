package com.example.mapping_assignment.mapping;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class MembershipCard {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer cardNumber;
    private String issuedDate;
    private String expiryDate;

    @OneToOne(mappedBy = "membershipCard")
    @JsonIgnore
    private Member member;

    public MembershipCard() {
    }

    public MembershipCard(Integer id, Integer cardNumber, String issuedDate, String expiryDate, Member member) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
