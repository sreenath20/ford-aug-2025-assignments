package com.bank.wallet.application.Dto;

public class BalanceDto {
    private String email;
    private Double balance;

    public BalanceDto(String email, Double balance) {
        this.email = email;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}