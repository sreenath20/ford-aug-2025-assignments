package com.abc.app.user;


import com.abc.app.product.Product;
import com.abc.app.product.ProductException;

import java.util.Collection;

public interface UserService {
    UserInformation addUser(UserInformation userInformation)throws UserException;
    UserInformation getProductById(Integer id) throws UserException;
    UserInformation updateProductPriceById(String emailId, Integer phoneNumber) throws UserException;
    Collection<UserInformation> getAllProducts() throws UserException;
    UserInformation deleteProductById(String emailId) throws UserException;


}
