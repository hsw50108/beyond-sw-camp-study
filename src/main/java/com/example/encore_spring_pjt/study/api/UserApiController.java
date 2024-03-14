package com.example.encore_spring_pjt.study.api;

import com.example.encore_spring_pjt.study.api.dto.request.UserRequestStudy;
import com.example.encore_spring_pjt.study.api.dto.response.UserResponseStudy;
import com.example.encore_spring_pjt.study.service.UserServiceStudy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserApiController {

    private final UserServiceStudy userServiceStudy;

    // 저장
    @PostMapping("/save")
    public void saveUser(@RequestBody UserRequestStudy request) {
        userServiceStudy.save(request);
    }

    // 전체조회
    @GetMapping("")
    public List<UserResponseStudy> users() {
        List<UserResponseStudy> userList = userServiceStudy.getUserList();
        return userList;
    }

    // 단건조회
    @GetMapping("/{id}")
    public UserResponseStudy getUser(@PathVariable("id") Long id) {
        userServiceStudy.findUserByIdx(id);
        return null;
    }
}
