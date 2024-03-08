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
    public Integer save(BoardRequest params) {
        System.out.println("BoardServiceImpl.saveBoard" + boardMapper);
        boardMapper.save(params);
        return params.getIdx();
    }

    @Override
    @Transactional
    public BoardResponse findByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.findBoardByIdx");
        boardMapper.updateViewCnt(params);
        return boardMapper.findByIdx(params);
    }

    @Override
    @Transactional
    public Integer updateByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.updateBoardByIdx");
        boardMapper.updateByIdx(params);
        return params.getIdx();
    }

    @Override
    public Integer deleteByIdx(BoardRequest params) {
        System.out.println("BoardServiceImpl.deleteBoardByIdx");
        boardMapper.deleteByIdx(params);
        return params.getIdx();
    }

    @Override
    @Transactional(readOnly = true)
    public List<BoardResponse> findAll() {
        System.out.println("BoardServiceImpl.boardLists");
        return boardMapper.findAll();
    }

    @Override
    public Integer count() {
        System.out.println("BoardServiceImpl.cntBoard");
        return boardMapper.count();
    }


}
