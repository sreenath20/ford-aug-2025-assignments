package com.abc.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private final UserService userService;
    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserInformation addNewUser(@RequestBody UserDto userDto) throws UserException{
        UserInformation newUser= new UserInformation(userDto);
        return userService.addUser(newUser);
    }
    @PutMapping
    public UserInformation updateUser(@RequestBody UserInformation userInformation) throws UserException{

        return userService.updateProductPriceById(userInformation.getEmailId(),userInformation.getPhoneNumber());
    }
    @GetMapping
    public Collection<UserInformation> getAllUsers() throws UserException{
        return this.userService.getAllProducts();
    }
    @DeleteMapping("/{emailId}")
    public UserInformation deleteUser(@PathVariable String emailId) throws UserException{
        return this.userService.deleteProductById(emailId);
    }

}
