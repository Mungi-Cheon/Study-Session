package com.example.sessoin.controller;

import com.example.sessoin.model.UserDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @GetMapping("/me")
    public UserDto me(HttpSession session) {
        var userObject = session.getAttribute("USER");
        if (userObject != null) {
            return (UserDto) userObject;
        }
        return null;
    }
}
