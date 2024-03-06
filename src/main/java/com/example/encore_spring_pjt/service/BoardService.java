package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;

import java.util.List;

public interface BoardService {
    Integer saveBoard(BoardRequest params);
    BoardResponse findBoardByIdx(BoardRequest params);
    Integer updateBoardByIdx(BoardRequest params);
    Integer deleteBoardByIdx(BoardRequest params);
    List<BoardResponse> boardLists();
    Integer cntBoard();

}
