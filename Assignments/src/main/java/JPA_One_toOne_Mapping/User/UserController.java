package JPA_One_toOne_Mapping.User;

import com.demo.e_commerce.cart.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addNewUser(@RequestBody User newUser) {
        return userService.addNewUser(newUser);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }


    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }


    @GetMapping("/{id}/cart")
    public Cart getCartByUserId(@PathVariable Integer id) {
        return userService.getCartByUserId(id);
    }

    @PutMapping("/{id}/cart")
    public User updateCartByUserId(@PathVariable Integer id, @RequestBody Cart cart) {
        return userService.updateCartByUserId(id,cart);
    }

    @PatchMapping("/{id}/cart/add")
    public User addCartItemsByUserId(@PathVariable Integer id, @RequestBody Cart cart) {
        return userService.addItemsToCartByUserId(id,cart);
    }

    @PatchMapping("/{id}/cart/remove")
    public User removeCartItemsByUserId(@PathVariable Integer id, @RequestBody Cart cart) {
        return userService.removeItemsFromCartByUserId(id,cart);
    }


}
