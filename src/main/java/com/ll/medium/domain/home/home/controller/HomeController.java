package com.ll.medium.domain.home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/"})
    public String showMain() {
        return "domain/home/home/main";
    }

    public HomeController() {
    }
}