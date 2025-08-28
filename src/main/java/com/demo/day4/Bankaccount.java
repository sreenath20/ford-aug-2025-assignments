package com.demo.day4;

public class Bankaccount {

    private String name;
    private String id;
    private Double balance;

    public Bankaccount() {
    }

    public Bankaccount(String name, String id, Double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addFunds(Double funds){
        this.balance += funds;
    }

    public void withdrawFunds(Double funds){
        this.balance -= funds;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
