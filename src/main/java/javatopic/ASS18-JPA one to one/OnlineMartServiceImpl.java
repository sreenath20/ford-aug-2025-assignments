package com.e_commerce.onlinemart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineMartServiceImpl implements OnlineMartService {

    OnlineMartDao onlineMartDao;
    @Autowired
    public OnlineMartServiceImpl(OnlineMartDao onlineMartDao) {
        this.onlineMartDao = onlineMartDao;
    }

    @Override
    public Users createNewUser(Users newUser) throws OnlineMartException {
        return onlineMartDao.save(newUser);
    }

    @Override
    public Users getUserAndCartById(Long id) throws OnlineMartException {
        return onlineMartDao.findUsersAndCartById(id);
    }

    @Override
    public List<Object[]> deleteUserAndCartById(Long id) throws OnlineMartException {
        return List.of();
    }

    @Override
    public List<Object[]> getCartById(Long id) throws OnlineMartException {
        return List.of();
    }

    @Override
    public List<Object[]> addItemsToCart(Cart cart, Long id) throws OnlineMartException {
        return List.of();
    }

    @Override
    public List<Object[]> removeItemsFromCart(Cart cart, Long id) throws OnlineMartException {
        return List.of();
    }
}
