package com.example.encore_spring_pjt.study.domain;

import com.example.encore_spring_pjt.study.api.dto.request.UserRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static User createUser(String name, String password) {
        return new User(name, password);
    }
}
