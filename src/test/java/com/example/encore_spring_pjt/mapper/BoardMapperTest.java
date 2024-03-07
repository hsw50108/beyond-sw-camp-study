package com.example.encore_spring_pjt.mapper;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void save() {
//        System.out.println("BoardMapperTest.save" + boardMapper);

//        BoardRequest boardRequest = new BoardRequest();

        BoardRequest boardRequest = BoardRequest.builder()
                .title("builder2")
                .writer("dongwook")
                .noticeYn(true)
                .secretYn(true)
                .build();

        boardRequest.setTitle("orm class3");
        boardRequest.setContent("mybatis mapping3");
        boardRequest.setWriter("encore3");
        boardRequest.setNoticeYn(true);
        boardRequest.setSecretYn(false);

        boardMapper.save(boardRequest);
    }

    @Test
    void findByIdx() throws Exception {
        System.out.println("BoardMapperTest.findById");
//        BoardRequest boardRequest = new BoardRequest();
//        boardRequest.setIdx(1);

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(1)
                .build();

        BoardResponse response = boardMapper.findByIdx(boardRequest);

        System.out.println("BoardMapperTest.find result : ");
        System.out.println(response);
        System.out.println("BoardMapperTest.find json result : ");
        String boardJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(response);
        System.out.println(boardJson);
    }

    @Test
    void updateByIdx() throws Exception {
        System.out.println("BoardMapperTest.findById");

//        BoardRequest boardRequest = new BoardRequest();
//        boardRequest.setIdx(1);

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(1)
                .build();



        BoardResponse response = boardMapper.findByIdx(boardRequest);

        if (response != null) {
            boardRequest.setTitle("update3");
            boardRequest.setContent("update content");
            boardRequest.setWriter("update by dongwook");
            boardMapper.updateByIdx(boardRequest);
        } else {
            throw new IllegalArgumentException("회원을 찾을 수 없습니다.");
        }
    }

    @Test
    void count() {
        System.out.println("BoardMapperTest.count");
        int count = boardMapper.count();
        System.out.println("count : " + count);
    }

    @Test
    void deleteByIdx() {
        System.out.println("BoardMapperTest.deleteByIdx");
//        BoardRequest boardRequest = new BoardRequest();
//        boardRequest.setIdx(2);

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(2)
                .build();


        boardMapper.deleteByIdx(boardRequest);
    }

    @Test
    void findAll() {
        System.out.println("BoardMapperTest.findAll");

        List<BoardResponse> list = boardMapper.findAll();

        for (BoardResponse response : list) {
            System.out.println(response);
        }
    }

}