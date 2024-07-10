package com.example.encore_spring_pjt.controller;

import com.example.encore_spring_pjt.domain.BoardResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController : responseBody
@Controller
public class TestController {
    /*@RequestMapping("/")
    public String index() {
        System.out.println("TestController.index");
        return "index";
    }*/

    /*@RequestMapping("/")
    public ModelAndView index() {
        System.out.println("TestController.index");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }*/

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("TestController.index");
        model.addAttribute("msg", "welcome to Spring boot with jsp");
        return "index";
    }

    @RequestMapping("/test")
    public void test() {
        System.out.println("TestController.index");
    }

//    @GetMapping("/json")
//    @ResponseBody
//    public BoardResponse json() {
//        System.out.println("TestController.json");
//
//        BoardResponse board = BoardResponse.builder()
//                .title("controller using builder")
//                .content("json content")
//                .writer("dongwook")
//                .build();
//
//        return board;
//    }

    @GetMapping("/json")
    @ResponseBody
    public List<BoardResponse> json() {
        System.out.println("TestController.json");

        BoardResponse board = BoardResponse.builder()
                .title("controller using builder")
                .content("json content")
                .writer("dongwook")
                .build();
        ArrayList<BoardResponse> boardResponses = new ArrayList<>();

        boardResponses.add(board);
        boardResponses.add(board);
        boardResponses.add(board);
        boardResponses.add(board);

        return boardResponses;
    }
}
