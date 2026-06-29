package com.example.helloapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    // Display the login page
    @GetMapping("/")
    public String showLoginPage() {
        return "index";
    }

    // Process the login form
    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        // Debugging - check what values are received
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Check credentials
        if ("admin".equals(username) && "12345".equals(password)) {

            model.addAttribute("username", username);

            return "welcome";
        }

        // Invalid login
        model.addAttribute("error", "Invalid Username or Password");

        return "index";
    }
}