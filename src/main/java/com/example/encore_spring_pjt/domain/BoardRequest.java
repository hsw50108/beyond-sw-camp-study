package com.example.encore_spring_pjt.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {

    private String title;
    private String content;
    private String writer;
    private boolean noticeYn;
    private boolean secretYn;


}
