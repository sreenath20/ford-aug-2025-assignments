package JPA_One_toOne_Mapping.User;

import com.demo.e_commerce.cart.Cart;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity

public class User {

    @Id
    private Integer id;

    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private String email;

    @JsonIgnore
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Cart cart;

    public User() {}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "UserTable{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
