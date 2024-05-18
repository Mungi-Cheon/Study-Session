package com.example.sessoin.service;

import com.example.sessoin.db.UserRepository;
import com.example.sessoin.model.LoginRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserRepository userRepository;

    public void login(HttpSession session, LoginRequest loginRequest) {
        var id = loginRequest.getId();
        var password = loginRequest.getPassword();

        var optionalUser = userRepository.findByName(id);

        if (optionalUser.isPresent()) {
            var userDto = optionalUser.get();
            if (userDto.getPassword().equals(password)) {
                session.setAttribute("USER", userDto);
            } else {
                throw new RuntimeException("Password Not Match");
            }
        } else {
            throw new RuntimeException("User Not Found");
        }
    }
}
