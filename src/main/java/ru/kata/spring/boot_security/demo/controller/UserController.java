package ru.kata.spring.boot_security.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.validation.Valid;


@Controller
public class UserController {
//    private final UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping()
//    public String startServer() {
//        return "index";
//    }
//
//
//
//    @GetMapping("/data")
//    public String show(@RequestParam(value = "name", required = false) String name,
//                       Model model) {
//        model.addAttribute("users", userService.findByUsername(name));
//        return "users/data";
//    }


}