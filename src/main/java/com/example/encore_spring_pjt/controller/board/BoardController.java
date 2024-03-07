package com.example.encore_spring_pjt.controller.board;

import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.service.BoardService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Resource(name = "board")
    private BoardService boardService;
    @RequestMapping("/list.hanwha")
    @ResponseBody
    public List<BoardResponse> list() {
        System.out.println("BoardController.list");
        List<BoardResponse> boardResponses = boardService.boardLists();

        for (BoardResponse boardResponse : boardResponses) {
            System.out.println(boardResponse);
        }

        return boardResponses;
    }

}
