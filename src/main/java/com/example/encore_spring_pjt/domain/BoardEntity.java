package com.example.encore_spring_pjt.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "encore_board_tbl")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String title;
    private String content;
    private String writer;
    //    @Column(name = "view_cnt")
    private Integer viewCnt;
    //    @Column(name = "notice_yn")
    private Boolean noticeYn;
    //    @Column(name = "secret_yn")
    private Boolean secretYn;
    //    @Column(name = "delete_yn")
    private Boolean deleteYn;
    //    @Column(name = "insert_time")
    private LocalDateTime insertTime;
    //    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Builder
    public BoardEntity(String title, String content, String writer, Integer viewCnt, Boolean noticeYn, Boolean secretYn, Boolean deleteYn, LocalDateTime insertTime, LocalDateTime updateTime) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.viewCnt = viewCnt;
        this.noticeYn = noticeYn;
        this.secretYn = secretYn;
        this.deleteYn = false;
        this.insertTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }

    public static BoardEntity of(BoardRequest request) {
        BoardEntity entity = BoardEntity.builder()
                .idx(request.getIdx())
                .title(request.getTitle())
                .content(request.getContent())
                .secretYn(request.getSecretYn())
                .noticeYn(request.getNoticeYn())
                .writer(request.getWriter())
                .build();
        return entity;
    }
}
