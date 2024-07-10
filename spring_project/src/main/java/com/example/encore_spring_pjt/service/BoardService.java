package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BoardService {
    Integer save(BoardRequest params);

    Optional<BoardResponse> findByIdx(BoardRequest params);

    Integer updateByIdx(BoardRequest params);

    // 조회수 중복방지 메서드 추가
    Optional<BoardResponse> findBoardNotView(BoardRequest request);

    Integer deleteByIdx(BoardRequest params);

    List<BoardResponse> findAll();

    Integer count();
}
