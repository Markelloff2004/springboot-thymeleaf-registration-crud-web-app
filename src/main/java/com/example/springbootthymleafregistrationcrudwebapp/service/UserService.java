package com.example.springbootthymleafregistrationcrudwebapp.service;

import com.example.springbootthymleafregistrationcrudwebapp.model.User;
import com.example.springbootthymleafregistrationcrudwebapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto);
}
