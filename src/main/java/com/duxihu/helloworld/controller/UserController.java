package com.duxihu.helloworld.controller;

import com.duxihu.helloworld.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return new User(id,"duxihu",25);
    }
}
