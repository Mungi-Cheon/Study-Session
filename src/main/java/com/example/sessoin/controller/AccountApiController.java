package com.example.sessoin.controller;

import com.example.sessoin.model.LoginRequest;
import com.example.sessoin.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final UserService userService;

    @PostMapping("/login")
    public void login(HttpSession session, @RequestBody LoginRequest loginRequest) {
        userService.login(session, loginRequest);
    }
}
