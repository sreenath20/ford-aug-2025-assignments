package JPA_One_toOne_Mapping.User;

import com.demo.e_commerce.cart.Cart;
import com.demo.e_commerce.cart.CartException;

public interface UserService {
    
    User getUserById(Integer id) throws UserException;
    
    User addNewUser(User newUser) throws UserException;
    
    String deleteUserById(Integer id)  throws UserException;

    Cart getCartByUserId(Integer id)  throws UserException, CartException;

    User updateCartByUserId(Integer id, Cart cart) throws UserException;

    User addItemsToCartByUserId(Integer id, Cart cart)  throws UserException;

    User removeItemsFromCartByUserId(Integer id, Cart cart)  throws UserException;
}
