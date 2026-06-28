package com.example.helloapp;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {

        return "index";

    }

    @GetMapping("/hello")
    public String hello(

            @RequestParam(defaultValue="World") String name,

            Model model

    ) {

        model.addAttribute("name",name);

        model.addAttribute("date",LocalDate.now());

        model.addAttribute("time",LocalTime.now());

        return "hello";

    }

}