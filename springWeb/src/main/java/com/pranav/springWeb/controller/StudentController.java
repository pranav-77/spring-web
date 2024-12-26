package com.pranav.springWeb.controller;

import com.pranav.springWeb.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController //controller and responseBody
@Slf4j  //log message
public class StudentController {
    @GetMapping("/hello")
    public String hello() {
        log.info("Log info level");
        return "Hello World!";
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public String read(@PathVariable String name) {
        return "The name: " + name;
    }

    @GetMapping("/addNum/{num1}")
    public int addNum(@PathVariable int num1, @RequestParam(defaultValue = "0") int num2) {
        return num1 + num2;
    }

    @GetMapping("/show/{message}/{message2}")
    public String showDetails(@PathVariable String message, @PathVariable String message2) {
        return message + " " + message2;
    }

    @GetMapping("/student")
    public String student(@RequestBody Student student) {
        return student.getDepartment() + " " + student.getName();
    }

    @GetMapping("/studentInfo")
    public Student returnJson(@RequestBody Student student) {
        return student;
    }

    @GetMapping("/modelStudent")
    public Student form(@ModelAttribute Student student) {
        return student;
    }

}
