package com.example.encore_spring_pjt.controller.jpa.dao;

import com.example.encore_spring_pjt.controller.jpa.domain.JpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EncoreRepository extends JpaRepository<JpaEntity, Integer> {

    @Query("SELECT U FROM encore_jpa_test_tbl U WHERE U.seq = :seq")
    Optional<JpaEntity> findByCustomerId(@Param("seq") Integer seq);

    @Modifying
    @Query("update encore_jpa_test_tbl U " +
            "SET U.id = :id, U.pwd = :pwd, U.name = :name " +
            "WHERE U.seq = :seq")
    void updateEntity(String id, String pwd, String name, Integer seq);

    List<JpaEntity> findByName(String name);
    List<JpaEntity> findByNameLike(String name);

}
