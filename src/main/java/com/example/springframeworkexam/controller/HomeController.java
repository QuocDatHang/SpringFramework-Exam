package com.example.springframeworkexam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping
    public String showHomePage() {

        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "error/403";
    }
}
