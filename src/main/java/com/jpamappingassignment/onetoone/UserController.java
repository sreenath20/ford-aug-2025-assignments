package com.example.jpamappingassignment.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    //USER MANAGEMENT

    @PostMapping
    public CartUser create(@RequestBody CartUser user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/{id}")
    public CartUser findById(@PathVariable Long id) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));

        return user;
    }

    @DeleteMapping("/{id}")
    public CartUser delete(@PathVariable Long id) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
        this.userRepository.deleteById(id);
        return user;
    }

    //CART MANAGEMENT

    @GetMapping("/{id}/cart")
    public Cart findCartById(@PathVariable Long id) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
        Cart cart = this.cartRepository.findById(user.getCart().getId()).orElseThrow(()->new Exception("Cart not found"));
        return cart;
    }

    @PutMapping("/{id}/cart")
    public Cart updateCart(@PathVariable Long id, @RequestBody Cart cart) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
        user.setCart(cart);
        this.userRepository.save(user);
        return this.cartRepository.findById(user.getCart().getId()).orElseThrow(()->new Exception("Cart not found"));
    }

    @PatchMapping("/{id}/cart/add")
    public Cart updateAddCart(@PathVariable Long id) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
        user.getCart().setTotalItems(user.getCart().getTotalItems() + 1);
        user.getCart().setTotalPrice(user.getCart().getTotalPrice() + 100);
        this.userRepository.save(user);
        return this.cartRepository.findById(user.getCart().getId()).orElseThrow(()->new Exception("Cart not found"));
    }

    @PatchMapping("/{id}/cart/remove")
    public Cart updateRemoveCart(@PathVariable Long id) throws Exception {
        CartUser user = this.userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
        user.getCart().setTotalItems(user.getCart().getTotalItems() - 1);
        user.getCart().setTotalPrice(user.getCart().getTotalPrice() - 100);
        this.userRepository.save(user);
        return this.cartRepository.findById(user.getCart().getId()).orElseThrow(()->new Exception("Cart not found"));
    }



}
