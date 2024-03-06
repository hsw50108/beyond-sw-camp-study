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
public class BoardRequest {

    private Integer idx;
    private String title;
    private String content;
    private String writer;
    private boolean noticeYn;
    private boolean secretYn;

    @Builder
    public BoardRequest(Integer idx, String title, String content, String writer, boolean noticeYn, boolean secretYn) {
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.noticeYn = noticeYn;
        this.secretYn = secretYn;
    }

   /* public static BoardRequest of(Integer idx) {
        return new BoardRequest(idx);
    }

    public BoardRequest(Integer idx) {
        this.idx = idx;
    }*/
}
