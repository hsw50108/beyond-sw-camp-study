package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("board")
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

//    @Autowired
//    private BoardMapper boardMapper;

    private final BoardMapper boardMapper;

    @Transactional
    @Override
    public Integer saveBoard(BoardRequest params) {
        System.out.println("BoardServiceImpl.saveBoard" + boardMapper);
        boardMapper.save(params);
        return params.getIdx();
    }

    @Override
    @Transactional
    public BoardResponse findBoardByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.findBoardByIdx");
        BoardResponse findBoard = boardMapper.findByIdx(params);
        return findBoard;
    }

    @Override
    @Transactional
    public Integer updateBoardByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.updateBoardByIdx");
        boardMapper.updateByIdx(params);
        return params.getIdx();
    }

    @Override
    public Integer deleteBoardByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.deleteBoardByIdx");
        boardMapper.deleteByIdx(params);
        return params.getIdx();
    }

    @Override
    @Transactional(readOnly = true)
    public List<BoardResponse> boardLists() {
        System.out.println("BoardServiceImpl.boardLists");
        List<BoardResponse> boardResponseList = boardMapper.findAll();
        return boardResponseList;
    }

    @Override
    public Integer cntBoard() {
        System.out.println("BoardServiceImpl.cntBoard");
        return boardMapper.count();
    }

}
