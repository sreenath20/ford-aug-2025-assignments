package com.abc.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public NormalUser createUser(@RequestBody NormalUser user) throws UserException {
        return this.userService.addNewUser(user);
    }

    @GetMapping("/{id}")
    public NormalUser getUser(@PathVariable Integer id) throws UserException {
        return this.userService.getUserById(id);
    }

    @PatchMapping
    public NormalUser patchUser(@RequestBody NormalUser user) throws UserException {
        return this.userService.updateUserNameById(user.getId(), user.getName());
    }

    @GetMapping("/all")
    public Collection<NormalUser> getAllUsers() throws UserException {
        return this.userService.getAllUsers();
    }

}
