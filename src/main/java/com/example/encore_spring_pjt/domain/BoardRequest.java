package com.example.encore_spring_pjt.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Builder Pattern
 */
@Getter
@Setter
@ToString
@Builder
public class BoardRequest {

    private Integer idx;
    private String title;
    private String content;
    private String writer;
    private boolean noticeYn;
    private boolean secretYn;

}
