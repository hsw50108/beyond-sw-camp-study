package com.example.encore_spring_pjt.study.repository;

import com.example.encore_spring_pjt.study.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryStudy extends JpaRepository<User, Long> {

}
