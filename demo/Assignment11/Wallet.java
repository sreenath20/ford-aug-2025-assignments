package com.demo.Assignment11;

public class Wallet {
    private Integer id;
    private String name;
    private Double balance;
    private String email;
    private String password;
    public Wallet(){

    }
    public Wallet(Integer id, String name, Double balance, String email, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.password = password;

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
