package com.example.encore_spring_pjt.controller.board;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import com.example.encore_spring_pjt.service.BoardService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/board")
public class BoardController {

    //    @Autowired
//    BoardServiceImpl boardServiceImpl;
    @Resource(name = "board")
    private BoardService boardService;

//    @RequestMapping("/list.hanwha")
//    @ResponseBody
//    public List<BoardResponse> list(){
//        System.out.println("debug BoardController client path /board/list.hanwha");
//
//        //BoardServiceImpl listBoard() 메서드 호출하여 결과를 반환 받고
//        //반환받은 결과를 Model(requestScope) 에 심고 이 데이터를
//        //forward 되는 페이지에서 출력
//        List<BoardResponse> lst = service.listBoard();
//        System.out.println(lst);
//        return lst;
//    }

    @RequestMapping("/list.hanwha")
    public String list(Model model) {
        System.out.println("debug BoardController client path /board/list.hanwha");

        //BoardServiceImpl listBoard() 메서드 호출하여 결과를 반환 받고
        //반환받은 결과를 Model(requestScope) 에 심고 이 데이터를
        //forward 되는 페이지에서 출력
        List<BoardResponse> lst = boardService.findAll();
        //System.out.println(lst);
        model.addAttribute("lst", lst);
        return "list";
    }

//    @GetMapping("/view.hanwha/{idx}")
//    public void view(@PathVariable("idx") Integer idx){
//    @GetMapping("/view.hanwha")
//    public String view(BoardRequest params, Model model){
//    //public void view(BoardRequest params){
//        System.out.println("debug Boardcontroller client path /board/view.hanwha");
//        System.out.println("params value , " + params.getIdx());
//        /*
//        view로부터 키(idx) 값을 전달받고 객체로 바인딩되서 service 에 전달
//        response 객체를 반환받고
//        해당 response 객체 Model에 심어서 viewPage로 전달 과정
//         */
//        Optional<BoardResponse> response = service.findBoard(params);
//        System.out.print(response);
//        model.addAttribute("response", response.get());
//        return "view";
//    }

    // 조회수 중복방지 구현으로 커스터마이징....
    // 쿠키를 이용한 WEB : request.getSession() , request.getCookies();
    // setMaxAge(60 * 60 * 24)
    @GetMapping("/view.hanwha")
    public String view(BoardRequest params,
                       Model model,
                       HttpServletRequest request,
                       HttpServletResponse response) {
        //public void view(BoardRequest params){
        System.out.println("debug Boardcontroller client path /board/view.hanwha");
        System.out.println("params value , " + params.getIdx());
        /*
        view로부터 키(idx) 값을 전달받고 객체로 바인딩되서 service 에 전달
        response 객체를 반환받고
        해당 response 객체 Model에 심어서 viewPage로 전달 과정
         */
        //Optional<BoardResponse> responseEntity = service.findBoard(params);
        //model.addAttribute("response", responseEntity.get());
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies length : " + cookies.length);
        int visited = 0;

        for (Cookie cookie : cookies) {
            System.out.println("cookie name: " + cookie.getName());
            visited = 1;
            System.out.println("visit exist visited");

            if (cookie.getName().equals("visit")) {
                if (cookie.getValue().contains(params.getIdx() + "")) {
                    System.out.println("cookie value idx " + params.getIdx());
                    Optional<BoardResponse> result = boardService.findBoardNotView(params);
                    model.addAttribute("response", result.get());
                } else {

                }
            }
        }
        System.out.println("debug >>> after loop  visited , " + visited);
        if (visited == 0) {
            Cookie c = new Cookie("visit", params.getIdx() + "");
            response.addCookie(c);
            Optional<BoardResponse> result = boardService.findByIdx(params);
            model.addAttribute("response", result.get());
        }

        return "view";
    }

    @GetMapping("/write.hanwha")
    public String writeForm() {
        System.out.println("debug Boardcontroller client path /board/write.hanwha");
        return "write";
    }

    @PostMapping("/write.hanwha")
    public String writeForm(BoardRequest params) {
        System.out.println(params);
        Integer idx = boardService.save(params);
        System.out.println("debug >>>>>>>>>>>> " + idx + " 번 글이 삭제되었습니다.");
        return "redirect:/board/list.hanwha";
    }

    @GetMapping("/delete.hanwha")
    public String deleteForm(BoardRequest params) {
        boardService.deleteByIdx(params);
        return "redirect:/board/list.hanwha";
    }

    @GetMapping("/update.hanwha")
    public String editForm(BoardRequest params, Model model) {
        if (params.getIdx() != null) {
            Optional<BoardResponse> editParams = boardService.findByIdx(params);
            model.addAttribute("response", editParams);
            System.out.println(editParams);
        }
        return "write";
    }

    @PostMapping("/update.hanwha")
    public String updateForm(BoardRequest params) {
        boardService.updateByIdx(params);
        return "redirect:/board/view.hanwha?idx=" + params.getIdx();
    }


}
