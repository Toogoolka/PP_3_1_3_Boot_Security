package ru.kata.spring.boot_security.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.util.UserValidator;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final UserValidator userValidator;

    @Autowired
    public AuthController(UserValidator userValidator) {
        this.userValidator = userValidator;


    }

    @GetMapping("/login")
    public String loginPage() {
        return "/auth/login";
    }

}
