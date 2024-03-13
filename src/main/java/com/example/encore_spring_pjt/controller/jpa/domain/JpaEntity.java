package com.example.encore_spring_pjt.controller.jpa.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "encore_jpa_test_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class JpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;
    private String id;
    private String pwd;
    private String name;


}
