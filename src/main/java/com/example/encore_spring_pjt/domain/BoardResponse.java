package com.example.encore_spring_pjt.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponse {

    private Integer idx;
    private String title;
    private String content;
    private String writer;
    private boolean noticeYn;
    private boolean secretYn;
    private LocalDateTime insertTime;
    private LocalDateTime updateTime;
}
