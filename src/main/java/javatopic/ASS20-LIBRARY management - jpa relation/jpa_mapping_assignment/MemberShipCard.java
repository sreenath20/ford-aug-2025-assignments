package com.e_commerce.onlinemart.jpa_mapping_assignment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class MemberShipCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;
    private String cardType;
   private LocalDate issueDate;
    private LocalDate expiryDate;

    @OneToOne(mappedBy = "memberShipCard", cascade = CascadeType.ALL)
    @JsonIgnore
    private Member member;

    public MemberShipCard() {
    }

    public MemberShipCard(int cardId, String cardType, LocalDate issueDate, LocalDate expiryDate) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }


    public MemberShipCard(Member member) {
        this.member = member;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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
