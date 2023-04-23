package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kata.spring.boot_security.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class AuthorizedUserController {
    private final UserService userService;
    @Autowired
    public AuthorizedUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

//    @GetMapping("/data")
//    public String show(@RequestParam(value = "name", required = false) String name,
//                       Model model) {
//        model.addAttribute("users", userService.findByUsername(name));
//        return "users/data";
//    }
}
