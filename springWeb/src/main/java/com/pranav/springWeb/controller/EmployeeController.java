package com.pranav.springWeb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @PostMapping("/details/{name}")
    public String details(@PathVariable String name, @RequestParam String msg) {
        return name + " " + msg;
    }
}
