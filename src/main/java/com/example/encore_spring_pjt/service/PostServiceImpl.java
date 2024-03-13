package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.controller.rest.dao.PostRepository;
import com.example.encore_spring_pjt.domain.BoardEntity;
import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("post")
@RequiredArgsConstructor
public class PostServiceImpl {

    private final PostRepository postRepository;
    public void save(BoardRequest request) {
        BoardEntity boardEntity = BoardEntity.of(request);
        postRepository.save(boardEntity);
    }

    public Optional<BoardResponse> findByIdx(BoardRequest params) {
        return null;
    }

    public Integer updateByIdx(BoardRequest params) {
        return null;
    }

    public Integer deleteByIdx(BoardRequest params) {
        return null;
    }

    public List<BoardEntity> findAll() {
        return postRepository.findAll();
    }

    public Integer count() {
        return null;
    }

}
