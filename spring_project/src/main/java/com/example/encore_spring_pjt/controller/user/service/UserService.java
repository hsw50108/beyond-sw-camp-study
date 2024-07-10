package com.example.encore_spring_pjt.controller.user.service;

import com.example.encore_spring_pjt.controller.user.domain.UserRequest;
import com.example.encore_spring_pjt.controller.user.domain.UserResponse;
import com.example.encore_spring_pjt.controller.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public UserResponse loginService(UserRequest request) {
        System.out.println("debug >>>> service loginService ");
        return userMapper.loginRow(request);
    }

    public void register(UserRequest request) {
        System.out.println("UserService.register");
        userMapper.insertRow(request);
    }

    public String getPwd(UserRequest params){
        System.out.println("debug >>>> service getPwd");
        return userMapper.getPwd(params);
    }
}