package com.abc.app.Ecommerce;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cart_id", referencedColumnName = "id")// it will create foreign key
    private CartEntity cartEntity;

    public UserEntity() {
    }
    public UserEntity(String username, String email, String password) {

        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public CartEntity getCartEntity() {
        return cartEntity;
    }

    public void setCartEntity(CartEntity cartEntity) {
        this.cartEntity = cartEntity;
    }


}
