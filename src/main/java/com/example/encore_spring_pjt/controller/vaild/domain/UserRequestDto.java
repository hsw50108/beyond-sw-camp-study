package com.example.encore_spring_pjt.controller.vaild.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserRequestDto {

    private static final String PHONE_NUMBER_FORMAT = "^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$";
    public static final String AGE_VALIDATE = "나이를 확인해 주세요";

    private String name;
    private String password;

    @Email
    private String email;

    @Pattern(regexp = PHONE_NUMBER_FORMAT, message = "핸드폰 입력양식을 맞춰주세요")
    private String cellPhone;

    @Min(value = 0, message = AGE_VALIDATE)
    @Max(value = 150, message = AGE_VALIDATE)
    private int age;


}
