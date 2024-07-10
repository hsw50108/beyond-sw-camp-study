package com.example.encore_spring_pjt.controller.user.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class UserRequest {

    @NotBlank(message = "필수입니다.")
    private String id;

    @NotBlank
    private String pwd;

    @NotBlank
    private String name;

}
