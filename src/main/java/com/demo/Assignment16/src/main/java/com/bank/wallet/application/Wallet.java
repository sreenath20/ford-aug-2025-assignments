package com.bank.wallet.application;

import com.bank.wallet.application.Dto.BalanceDto;
import com.bank.wallet.application.Dto.WalletDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class Wallet {
    @Id

    private Integer id;

    private String name;
    private Double balance;
    private String email;
    private String password;

//Default constructor
    public Wallet() {
    }

    public Wallet(WalletDto walletDto) {
        this.id = walletDto.getId();
        this.email = walletDto.getEmail();
        this.balance = walletDto.getBalance();
        this.name = walletDto.getName();
        this.password = walletDto.getPassword();
    }
    public Wallet(BalanceDto balanceDto) {
        this.balance=balanceDto.getBalance();
        this.email=balanceDto.getEmail();
    }
    public Wallet(Integer id, String name, String email, String password, Double balance) {
        this.id = id;
        this.password = password;
        this.balance = balance;
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

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
