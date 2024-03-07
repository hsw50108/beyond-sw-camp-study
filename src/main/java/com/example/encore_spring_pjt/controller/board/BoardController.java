package com.example.encore_spring_pjt.controller.board;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.service.BoardService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Resource(name = "board")
    private BoardService boardService;

    /*@RequestMapping("/list.hanwha")
    @ResponseBody
    public List<BoardResponse> list() {
        System.out.println("BoardController.list");
        List<BoardResponse> boardResponses = boardService.boardLists();

        for (BoardResponse boardResponse : boardResponses) {
            System.out.println(boardResponse);
        }

        return boardResponses;
    }*/

    @RequestMapping("/list.hanwha")
    public String list() {
        System.out.println("BoardController.list");
        List<BoardResponse> boardResponses = boardService.boardLists();
        for (BoardResponse boardResponse : boardResponses) {
            System.out.println(boardResponse);
        }
        return "list";
    }

    @GetMapping("/view.hanwha")
    public String view(BoardRequest request, Model model) {
        System.out.println("BoardController.view");
        System.out.println("value : " + request.getIdx());

        // view 로부터 키(idx)를 전달 받고 객체로 바인딩
        // -> 서비스로 전달
        // -> response 객체 반환 -> model 에 심어서 뷰 페이지로 전달

        BoardResponse boardResponse = boardService.findBoardByIdx(request);
        model.addAttribute("boardResponse", boardResponse);

        return "view";
    }

    @GetMapping("/write.hanwha")
    public String writeFormPage() {
        System.out.println("BoardController.writeFormPage");
        return "write";
    }

    @PostMapping("/write.hanwha")
    public String writeForm(BoardRequest request) {
        System.out.println("BoardController.writeForm");

        request.setSecretYn(false);
        request.setNoticeYn(false);
        boardService.saveBoard(request);

        return "redirect:/board/list.hanwha";
    }
}
