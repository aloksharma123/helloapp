package com.example.helloapp;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/greet")
    public String greet(

            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String language,

            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("language", language);

        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", LocalTime.now());

        return "hello";
    }

}