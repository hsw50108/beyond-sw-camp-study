package com.example.encore_spring_pjt.controller.rest;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.service.BoardService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


/*
HTTP 통신 client -> web server(WAS) 요청의 목적을 알리는 수단
-  Get, Post, Put, Delete
- Get    : Read
- Post   : Update
- Put    : Insert
- Delete : Delete
-  http://serverip:port/board?idx=1

HTTP 응답코드의 상태코드
  1xx(정보)          : 요청이 성공했고 서버는 프로세스를 계속 진행하겠다.
  2xx(성공)          : 요청이 성공했고 서버는 해당 요청을 수용
  3xx(리다이렉트)     : 요청이 제대로 처리되지 않아서 재요청 작업이 필요
  4xx(클라이언트오류) : 요청의 문법이 잘못되었거나 요청을 처리할 수 없을 때
  5xx(서버오류)      : 요청에 대해서 실패(NPE)
 */
@RestController
@RequestMapping("/board-rest")
public class RestBoardController {
    @Resource(name = "board")
    private BoardService boardService;

    // 조회
    @GetMapping(value = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BoardResponse>> list() {
        System.out.println("RestBoardController.list");
        List<BoardResponse> list = boardService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 삭제 - pathVariable
    @DeleteMapping(value = "/{idx}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> delete(@PathVariable("idx") Integer idx) {
        System.out.println("RestBoardController.delete");

        BoardRequest board = BoardRequest.builder()
                .idx(idx)
                .build();

        boardService.deleteByIdx(board);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // 게시물 번호로 조회
    @GetMapping(value = "/view/{idx}")
    public ResponseEntity<Optional<BoardResponse>> getBoard(@PathVariable("idx") Integer idx) {
        System.out.println("RestBoardController.getBoard");

        BoardRequest board = BoardRequest.builder()
                .idx(idx)
                .build();

        Optional<BoardResponse> response = boardService.findByIdx(board);
        System.out.println("is present " + response.isPresent());
        System.out.println("RestBoardController.getBoard " + response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 게시물 번호로 수정
    /*@PutMapping("/{idx}/{title}/{content}/{writer}")
    public ResponseEntity<BoardRequest> editBoard(
            @PathVariable("idx") Integer idx,
            @PathVariable("title") String title,
            @PathVariable("content") String content,
            @PathVariable("writer") String writer
    ) {

        BoardRequest board = BoardRequest.builder()
                .idx(idx)
                .title(title)
                .content(content)
                .writer(writer)
                .build();

        boardService.updateByIdx(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }*/

    // 객체형식으로 테스트 진행
    @PutMapping("/update")
    public ResponseEntity<Void> editBoard(BoardRequest param) {
        System.out.println("RestBoardController.editBoard");
        System.out.println(param);

        Integer result = boardService.updateByIdx(param);
//        BoardRequest board = BoardRequest.builder()
//                .idx(param.getIdx())
//                .title(param.getTitle())
//                .content(param.getContent())
//                .writer(param.getWriter())
//                .build();
//
//        boardService.updateByIdx(board);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/write", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Map<String, String>> write(BoardRequest params) {
        Integer result = boardService.save(params);
        Map<String, String> map = new HashMap<>();
        map.put("msg", result + "번 게시글 입력 완료");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}

