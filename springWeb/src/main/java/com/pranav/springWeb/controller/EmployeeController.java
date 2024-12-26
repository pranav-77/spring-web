package com.pranav.springWeb.controller;

import com.pranav.springWeb.model.Student;
import com.pranav.springWeb.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
    @PostMapping("/details/{name}")
    public String details(@PathVariable String name, @RequestParam String msg) {
        return name + " " + msg;
    }

    @PostMapping("/info")
    public String allDetails(@RequestBody User user) {
        log.info("All Details");
        return user.getUserName();
    }
}
