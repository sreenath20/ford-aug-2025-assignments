package SpringBoot_UserManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) throws UserException{
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) throws UserException{
        return userService.getUserById(id);
    }
    @PatchMapping("/update/{id}")
    public User updateUser(@PathVariable Integer id,@RequestBody User user) throws UserException{
        return userService.updateUserPasswordById(id,user);
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUserById(@PathVariable Integer id) throws UserException {
        return userService.deleteUserById(id);
    }
    @GetMapping("/all")
    public List<User> getAllUsers() throws UserException{
        return userService.getAllUsers();
    }



}
