package com.e_commerce.onlinemart;

import java.util.List;

public interface OnlineMartService {
    public Users createNewUser(Users newUser) throws OnlineMartException;

    public Users getUserAndCartById(Long id) throws OnlineMartException;

    public List<Object[]> deleteUserAndCartById(Long id) throws OnlineMartException;

    public List<Object[]> getCartById(Long id) throws OnlineMartException;

    public List<Object[]> addItemsToCart(Cart cart, Long id) throws OnlineMartException;

    public List<Object[]> removeItemsFromCart(Cart cart, Long id) throws OnlineMartException;

}
