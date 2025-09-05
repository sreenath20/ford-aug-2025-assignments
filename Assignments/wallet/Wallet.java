package com.demo.wallet;

/**
 <p>Online digital wallet<br>
 1. Customer Registration<br>
 2. Add funds<br>
 3. Withdraw funds<br>
 4. Transfer funds<br>
 5. Get account details<br>
 6. Admin function : get all registered users.<br>

 <p>Solution:<br>
 1. Collections [Map]<br>
 2. DBMS<br>
 */
public class Wallet {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Double balance;

    public Wallet(Integer id, String name, String email, String password, Double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public Wallet() {

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
