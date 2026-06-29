package com.example.helloapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

     
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
 
    @PostMapping("/login")
public String login(
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        HttpSession session,
        Model model) {

    if ("admin".equals(username) && "12345".equals(password)) {

        session.setAttribute("user", username);
        session.setMaxInactiveInterval(60);
        return "redirect:/welcome";
    }

    model.addAttribute("error", "Invalid Username or Password");
    return "index";
}
@GetMapping("/dashboard")
public String dashboard(HttpSession session, Model model) {

    String user = (String) session.getAttribute("user");

    if (user == null) {
        return "redirect:/";
    }

    model.addAttribute("username", user);

    return "dashboard";
}
}