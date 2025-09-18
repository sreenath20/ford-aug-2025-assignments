package com.example.jpamappingassignment.onetoone;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class CartUser {
    @Id
    @GeneratedValue
    private long id;


    private String userName;

    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String password;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="cartid",referencedColumnName = "id")
    private Cart cart;

    public CartUser() {
    }

    public CartUser(long id, String userName, String email, String password, Cart cart) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.cart = cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
