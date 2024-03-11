package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    Integer save(BoardRequest params);

    Optional<BoardResponse> findByIdx(BoardRequest params);

    Integer updateByIdx(BoardRequest params);

    Integer deleteByIdx(BoardRequest params);

    List<BoardResponse> findAll();

    Integer count();
}
