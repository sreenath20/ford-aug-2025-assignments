package com.bank.wallet.application.Dto;


import jakarta.validation.constraints.Pattern;

public class WalletDto {

    private Integer id;
    @Pattern( regexp= "^[A-Z]{6,10}",
            message ="Name should not be null")
    private String name;
    private Double balance;
    private String email;
    private String password;
    private String fromEmailId;
    private String toEmailId;
    private Double amount;

    public WalletDto() {
    }

    public WalletDto(Integer id, String email, Double balance, String name, String password) {
        this.id = id;
        this.email = email;
        this.balance = balance;
        this.name = name;
        this.password = password;
    }



    public String getFromEmailId() {
        return fromEmailId;
    }

    public void setFromEmailId(String fromEmailId) {
        this.fromEmailId = fromEmailId;
    }

    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
