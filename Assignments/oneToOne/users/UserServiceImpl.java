package com.demo.e_commerce.users;

import com.demo.e_commerce.cart.Cart;
import com.demo.e_commerce.cart.CartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserTable getUserById(Integer id) throws UserException {
        return userRepository.findById(id)
                .orElseThrow(()->new UserException("User not found for id "+id));
    }

    @Override
    public UserTable addNewUser(UserTable newUser)throws UserException {
        if(userRepository.existsById(newUser.getId()))
            throw new UserException("User with id "+newUser.getId()+" already exists");
        return userRepository.save(newUser);
    }

    @Override
    public String deleteUserById(Integer id) throws UserException {
        if(!userRepository.existsById(id))
            throw new UserException("User with id "+id+" doesn't exists to delete");

        userRepository.deleteById(id);
        return "User with id "+id+"deleted Successfully..!";
    }

    @Override
    public Cart getCartByUserId(Integer id) throws UserException, CartException {
        UserTable foundUser = userRepository.findById(id)
                .orElseThrow(()->new UserException("User with id "+id+" not found"));
        if(foundUser.getCart()==null)
            throw new CartException("User with id "+id+" cart is empty");
        return foundUser.getCart();
    }

    @Override
    public UserTable updateCartByUserId(Integer id, Cart cart) throws UserException {
        UserTable foundUser = userRepository.findById(id)
                .orElseThrow(()->new UserException("User with id "+id+" not found"));
        Cart foundCart = foundUser.getCart();
        foundCart.setTotalItems(cart.getTotalItems());
        foundCart.setTotalPrice(cart.getTotalPrice());
        foundUser.setCart(foundCart);
        return userRepository.save(foundUser);
    }

    @Override
    public UserTable addItemsToCartByUserId(Integer id, Cart cart) throws UserException {
        UserTable foundUser = userRepository.findById(id)
                .orElseThrow(()->new UserException("User with id "+id+" not found"));
        Cart foundCart = foundUser.getCart();
        foundCart.setTotalItems(foundCart.getTotalItems() + cart.getTotalItems());
        foundCart.setTotalPrice(foundCart.getTotalPrice() + cart.getTotalPrice());
        foundUser.setCart(foundCart);
        return userRepository.save(foundUser);
    }

    @Override
    public UserTable removeItemsFromCartByUserId(Integer id, Cart cart) throws UserException {
        UserTable foundUser = userRepository.findById(id)
                .orElseThrow(()->new UserException("User with id "+id+" not found"));
        Cart foundCart = foundUser.getCart();
        foundCart.setTotalItems(foundCart.getTotalItems() - cart.getTotalItems());
        foundCart.setTotalPrice(foundCart.getTotalPrice() - cart.getTotalPrice());
        foundUser.setCart(foundCart);
        return userRepository.save(foundUser);
    }


}
