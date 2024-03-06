package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("post")
public class PostServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public Integer saveBoard(BoardRequest params) {
        System.out.println("PostServiceImpl.saveBoard" + boardMapper);
        return null;
    }

    @Override
    public BoardResponse findBoardByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public Integer updateBoardByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public Integer deleteBoardByIdx(BoardRequest params) {
        return null;
    }

    @Override
    public List<BoardResponse> boardLists() {
        return null;
    }

    @Override
    public Integer cntBoard() {
        return null;
    }
}
