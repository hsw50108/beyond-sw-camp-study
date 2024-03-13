package com.example.encore_spring_pjt.study.api;

import com.example.encore_spring_pjt.study.api.dto.request.UserRequest;
import com.example.encore_spring_pjt.study.api.dto.response.UserResponse;
import com.example.encore_spring_pjt.study.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserApiController {

    private final UserService userService;

    // 저장
    @PostMapping("/save")
    public void saveUser(@RequestBody UserRequest request) {
        userService.save(request);
    }

    // 전체조회
    @GetMapping("")
    public List<UserResponse> users() {
        List<UserResponse> userList = userService.getUserList();
        return userList;
    }

    // 단건조회
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable("id") Long id) {
        userService.findUserByIdx(id);
        return null;
    }
}
