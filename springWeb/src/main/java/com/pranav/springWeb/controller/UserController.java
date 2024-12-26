package com.pranav.springWeb.controller;

import com.pranav.springWeb.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @GetMapping("/details")
    public String details(@RequestBody User user) {
        log.info("UserController");
        return user.getUserName() + " " + user.getAddress();
    }
}
