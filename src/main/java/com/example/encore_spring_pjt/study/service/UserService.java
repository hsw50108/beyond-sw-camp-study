package com.example.encore_spring_pjt.study.service;

import com.example.encore_spring_pjt.study.api.dto.request.UserRequest;
import com.example.encore_spring_pjt.study.api.dto.response.UserResponse;
import com.example.encore_spring_pjt.study.domain.User;
import com.example.encore_spring_pjt.study.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void save(UserRequest request) {
        User user = User.createUser(request.getName(), request.getPassword());
        userRepository.save(user);
    }

    public List<UserResponse> getUserList() {
        List<User> users = userRepository.findAll();

        List<UserResponse> list = users.stream()
                .map(user -> new UserResponse(user.getId(), user.getName()))
                .collect(Collectors.toList());
        return list;
    }

    public UserResponse findUserByIdx(Long id) {
        Optional<User> findUser = userRepository.findById(id);




        return null;
    }
}
