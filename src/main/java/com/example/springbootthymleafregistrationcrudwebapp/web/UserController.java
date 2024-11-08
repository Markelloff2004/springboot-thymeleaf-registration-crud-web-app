package com.example.springbootthymleafregistrationcrudwebapp.web;

import com.example.springbootthymleafregistrationcrudwebapp.service.UserService;
import com.example.springbootthymleafregistrationcrudwebapp.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("userRegistrationDto")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("userRegistrationDto")UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
