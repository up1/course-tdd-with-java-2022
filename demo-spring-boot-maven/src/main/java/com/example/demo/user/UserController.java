package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserResponse getById(@PathVariable int id) {
        UserDomain userDomain = userService.get(id);
        return new UserResponse(userDomain.getId(),
                userDomain.getFirstname(),
                userDomain.getAge());
    }

}
