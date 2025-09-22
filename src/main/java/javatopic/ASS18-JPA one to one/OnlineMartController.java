package com.e_commerce.onlinemart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/users")
public class OnlineMartController {

    private OnlineMartService onlineMartService;


    @Autowired
    public OnlineMartController(OnlineMartService onlineMartService) {
        this.onlineMartService = onlineMartService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users createNewUser(@RequestBody Users newUser) throws OnlineMartException {
        return onlineMartService.createNewUser(newUser);
    }

    @GetMapping("/Id")
    @ResponseStatus(HttpStatus.OK)
    public Users findUserById(@RequestParam Long id) throws OnlineMartException {
        return onlineMartService.getUserAndCartById(id);

    }
}
