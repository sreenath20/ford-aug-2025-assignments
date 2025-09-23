package com.demo.e_commerce.users;

import com.demo.e_commerce.cart.Cart;
import com.demo.e_commerce.cart.CartException;

public interface UserService {
    
    UserTable getUserById(Integer id) throws UserException;
    
    UserTable addNewUser(UserTable newUser) throws UserException;
    
    String deleteUserById(Integer id)  throws UserException;

    Cart getCartByUserId(Integer id)  throws UserException, CartException;

    UserTable updateCartByUserId(Integer id, Cart cart) throws UserException;

    UserTable addItemsToCartByUserId(Integer id, Cart cart)  throws UserException;

    UserTable removeItemsFromCartByUserId(Integer id, Cart cart)  throws UserException;
}
