package com.example.springbootthymleafregistrationcrudwebapp.web;

import com.example.springbootthymleafregistrationcrudwebapp.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/hello")
    public String showHelloPage() {
        return "hello";
    }
}
