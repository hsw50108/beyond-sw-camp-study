package com.example.encore_spring_pjt.controller.user.mapper;

import com.example.encore_spring_pjt.controller.user.domain.UserRequest;
import com.example.encore_spring_pjt.controller.user.domain.UserResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserResponse loginRow(UserRequest request);
    void insertRow(UserRequest request);
}
