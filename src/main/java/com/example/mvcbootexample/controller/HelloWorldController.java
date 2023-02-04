package com.example.mvcbootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("welcome")
public class HelloWorldController {

    @RequestMapping("home")
    public String homePage(Model model){
        model.addAttribute("message","Welcome to spring boot mvc");
        model.addAttribute("date", LocalDate.now());
        return "home";
    }

}
