package com.example.encore_spring_pjt.study.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserRequestStudy {

    private String name;
    private String password;

}
