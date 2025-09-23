package JPA_One_toOne_Mapping.Cart;

import com.demo.e_commerce.users.UserTable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime createdAt;

    private Integer totalItems;

    private Double totalPrice;

    @OneToOne(mappedBy = "cart")
    @JoinColumn
    @JsonIgnore
    private UserTable user;

    public Cart() {}

    public Cart(LocalDateTime createdAt, Integer totalItems, Double totalPrice) {
        this.createdAt = createdAt;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UserTable getUser() {
        return user;
    }

    public void setUser(UserTable user) {
        this.user = user;
    }

}
