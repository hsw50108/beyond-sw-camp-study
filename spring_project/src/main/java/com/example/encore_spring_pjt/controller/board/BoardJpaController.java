package com.example.encore_spring_pjt.controller.board;

import com.example.encore_spring_pjt.domain.BoardEntity;
import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.service.PostServiceImpl;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board/jpa")
//@RequiredArgsConstructor
public class BoardJpaController {

    @Resource(name = "post")
    private PostServiceImpl postService;

    // 전체조회
    @GetMapping("/list")
    public ResponseEntity<List<BoardEntity>> list() {
        System.out.println("BoardJpaController.list");
        List<BoardEntity> boardEntities = postService.findAll();
        return new ResponseEntity<>(boardEntities, HttpStatus.OK);
    }

    // save
    @PostMapping("/save")
    public void save(@RequestBody BoardRequest boardRequest) {
        postService.save(boardRequest);
    }
    // findByIdx

    // updateByIdx

    // deleteByIdx


}
