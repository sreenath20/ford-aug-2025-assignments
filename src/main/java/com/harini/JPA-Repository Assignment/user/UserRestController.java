package com.abc.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private final UserServiceImp userServiceImp;
    @Autowired
    public UserRestController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @PostMapping
    public Users addNewUser(@RequestBody Users newUser) throws UserException {
        return this.userServiceImp.addUser(newUser);
    }

    @GetMapping("/{id}")
    public Users getUserById (@PathVariable Integer id){
        return this.userServiceImp.getUserById(id);
    }

    @PatchMapping("{id}")
    public Users updateUserNameById(@PathVariable Integer id, @RequestBody Users user) throws UserException{
        return this.userServiceImp.updateUserNameById(id,user.getUserName());
    }

    @GetMapping("/all")
    public Collection<Users> getAllUsers() throws UserException {
        return this.userServiceImp.getAllUsers();
    }

}
