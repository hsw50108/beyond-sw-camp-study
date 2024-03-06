package com.example.encore_spring_pjt.service;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

// DI - Autowired, Resource
@SpringBootTest
class BoardServiceImplTest {

    /*
    @Autowired
    private BoardService boardServiceImpl;
     */
    @Resource(name = "board")
    private BoardService boardService;

    @Test
    void serviceSave() {
        System.out.println("BoardServiceImplTest.serviceSave" + boardService);
//        BoardRequest boardRequest = new BoardRequest();

        BoardRequest boardRequest = BoardRequest.builder()
                .title("builder")
                .writer("dongwook")
                .noticeYn(true)
                .secretYn(true)
                .build();

        boardRequest.setTitle("service class");
        boardRequest.setContent("connection mapper using service");
        boardRequest.setWriter("dongwook");
        boardRequest.setNoticeYn(true);
        boardRequest.setSecretYn(true);

        Integer idx = boardService.saveBoard(boardRequest);
        System.out.println("입력한 데이터의 키 값을 출력 : " + idx);
    }

    @Test
    void cntBoard() {
        System.out.println("BoardServiceImplTest.cntBoard");
        Integer cntBoard = boardService.cntBoard();
        System.out.println(cntBoard);
    }

    @Test
    void findBoardByIdx() {
        System.out.println("BoardServiceImplTest.findBoardByIdx");
//        BoardRequest boardRequest = new BoardRequest();

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(2)
                .build();

        boardRequest.setIdx(2);
        BoardResponse boardResponse = boardService.findBoardByIdx(boardRequest);
        System.out.println(boardResponse);
    }

    @Test
    void updateBoardByIdx() {
        System.out.println("BoardServiceImplTest.updateBoardByIdx");

//        BoardRequest boardRequest = new BoardRequest();

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(3)
                .build();

//        BoardRequest boardRequest = BoardRequest.of(3);

//        boardRequest.setIdx(3);
        BoardResponse response = boardService.findBoardByIdx(boardRequest);

        if (response != null) {
            boardRequest.setTitle("update service builder");
            boardRequest.setContent("update content sevice");
            boardRequest.setWriter("update by dongwook");
            Integer idx = boardService.updateBoardByIdx(boardRequest);
            System.out.println("업데이트된 idx : "+idx);
        } else {
            throw new IllegalArgumentException("찾는 회원이 없습니다.");
        }
    }

    @Test
    void deleteBoardByIdx() {
        System.out.println("BoardServiceImplTest.deleteBoardByIdx");
//        BoardRequest boardRequest = new BoardRequest();

        BoardRequest boardRequest = BoardRequest.builder()
                .idx(3)
                .build();


        boardRequest.setIdx(3);
        Integer idx = boardService.deleteBoardByIdx(boardRequest);
        System.out.println("삭제된 idx : " + idx);
    }

    @Test
    void findAll() {
        System.out.println("BoardServiceImplTest.findAll");
        List<BoardResponse> boardResponses = boardService.boardLists();

        for (BoardResponse boardResponse : boardResponses) {
            System.out.println(boardResponse);
        }
    }
    @Test
    void  serviceCountTest(){
        System.out.println("BoardServiceImplTest.serviceCountTest");
        Integer cntBoard = boardService.cntBoard();
        System.out.println(cntBoard);
    }






}