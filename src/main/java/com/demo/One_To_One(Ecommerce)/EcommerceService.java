package com.abc.app.Ecommerce;

import org.springframework.stereotype.Service;

import java.util.List;

public interface EcommerceService {
    UserEntity addUser(UserDto user) throws Exception;
    UserEntity updateUserWithCart(CartDto cartDto,Integer Id) throws Exception;
    List<UserDto> findAllUsersWithCarts(Integer Id) throws Exception;
    UserEntity DeleteUserWithCart(Integer Id) throws Exception;
    UserEntity getUserWithCartId(Integer Id) throws Exception;
    CartEntity updateCartWithUserId(Integer Id) throws Exception;
    CartEntity incrementCartItems(Integer Id,Double Price) throws Exception;
    CartEntity decrementingCartItems(Integer Id) throws Exception;

}
