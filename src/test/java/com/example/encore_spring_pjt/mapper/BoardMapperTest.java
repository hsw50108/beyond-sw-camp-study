package com.example.encore_spring_pjt.mapper;

import com.example.encore_spring_pjt.domain.BoardRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void save() {
        System.out.println("BoardMapperTest.save" + boardMapper);

        BoardRequest boardRequest = new BoardRequest();

        boardRequest.setTitle("orm class");
        boardRequest.setContent("mybatis mapping");
        boardRequest.setWriter("encore");
        boardRequest.setNoticeYn(true);
        boardRequest.setSecretYn(false);

        boardMapper.save(boardRequest);
    }


}