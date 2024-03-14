package com.example.encore_spring_pjt.study.service;

import com.example.encore_spring_pjt.study.api.dto.request.UserRequestStudy;
import com.example.encore_spring_pjt.study.api.dto.response.UserResponseStudy;
import com.example.encore_spring_pjt.study.domain.User;
import com.example.encore_spring_pjt.study.repository.UserRepositoryStudy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceStudy {

    private final UserRepositoryStudy userRepositoryStudy;
    public void save(UserRequestStudy request) {
        User user = User.createUser(request.getName(), request.getPassword());
        userRepositoryStudy.save(user);
    }

    public List<UserResponseStudy> getUserList() {
        List<User> users = userRepositoryStudy.findAll();

        List<UserResponseStudy> list = users.stream()
                .map(user -> new UserResponseStudy(user.getId(), user.getName()))
                .collect(Collectors.toList());
        return list;
    }

    public UserResponseStudy findUserByIdx(Long id) {
        Optional<User> findUser = userRepositoryStudy.findById(id);




        return null;
    }
}
