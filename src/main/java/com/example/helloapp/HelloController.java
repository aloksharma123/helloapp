package com.example.helloapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

    // Display the login page
    // @GetMapping("/")
    // public String showLoginPage() {
    //     return "index";
    // }
    @GetMapping("/welcome")
public String welcome(HttpSession session, Model model) {

    String user = (String) session.getAttribute("user");

    if (user == null) {
        return "redirect:/";
    }

    model.addAttribute("username", user);

    return "welcome";
}
@GetMapping("/logout")
public String logout(HttpSession session) {

    session.invalidate();

    return "redirect:/";
}

    // Process the login form
    // @PostMapping("/login")
    // public String login(
    //         @RequestParam("username") String username,
    //         @RequestParam("password") String password,
    //         Model model) {

    //     // Debugging - check what values are received
    //     System.out.println("Username: " + username);
    //     System.out.println("Password: " + password);

    //     // Check credentials
    //     if ("admin".equals(username) && "12345".equals(password)) {

    //         model.addAttribute("username", username);

    //         return "welcome";
    //     }

    //     // Invalid login
    //     model.addAttribute("error", "Invalid Username or Password");

    //     return "index";
    // }
    @PostMapping("/login")
public String login(
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        HttpSession session,
        Model model) {

    if ("admin".equals(username) && "12345".equals(password)) {

        session.setAttribute("user", username);

        return "redirect:/welcome";
    }

    model.addAttribute("error", "Invalid Username or Password");
    return "index";
}
}