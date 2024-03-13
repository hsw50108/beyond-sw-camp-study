package com.example.encore_spring_pjt.study.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String name;

}
