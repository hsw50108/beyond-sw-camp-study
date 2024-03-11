package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("post")
public class PostServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public Integer save(BoardRequest params) {
        System.out.println("PostServiceImpl.saveBoard" + boardMapper);
        return null;
    }

    @Override
    public Optional<BoardResponse> findByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public Integer updateByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public Integer deleteByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public List<BoardResponse> findAll() {
        return null;
    }

    @Override
    public Integer count() {
        return null;
    }

}
