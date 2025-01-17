package com.example.sessoin.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginRequest {

    private String id;
    private String password;
}
