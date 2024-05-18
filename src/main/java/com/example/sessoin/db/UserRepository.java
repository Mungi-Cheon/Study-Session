package com.example.sessoin.db;

import com.example.sessoin.model.UserDto;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>();

    public Optional<UserDto> findByName(String name) {
        return userList.stream().filter(user -> user.getName().equals(name)).findFirst();
    }

    @PostConstruct
    public void init() {
        userList.add(
            new UserDto("홍길동", "1234")
        );
        userList.add(
            new UserDto("유관순", "1234")
        );
        userList.add(
            new UserDto("강감찬", "1234")
        );
    }
}
