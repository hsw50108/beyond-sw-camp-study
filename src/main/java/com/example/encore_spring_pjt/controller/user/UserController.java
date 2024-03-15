package com.example.encore_spring_pjt.controller.user;

import com.example.encore_spring_pjt.controller.user.domain.UserRequest;
import com.example.encore_spring_pjt.controller.user.domain.UserResponse;
import com.example.encore_spring_pjt.controller.user.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user") // => http:// server ip : port/user
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    @PostMapping("/login.hanwha") // 강사님 기준 가장 이상적이라고 생각하는 방법
    public String login(UserRequest params, HttpSession session, RedirectAttributes attr) {
        System.out.println("debug UserController client path /user/login.hanwha");
        System.out.println("param value >>> id : " + params.getId() + " pwd : " + params.getPwd());
        String encodePwd = userService.getPwd(params); // 서버의 인코딩 된 암호 불러오기
        if (passwordEncoder.matches(params.getPwd(), encodePwd)){// 입력된 값과 인코딩 되어 저장되어있던 값 비교
            params.setPwd(encodePwd); // 입력이 유효하다면 params 의 값을 갱신하고 서비스로 보냄
        }
        UserResponse response = userService.loginService(params);
        if(response != null) {
            session.setAttribute("loginUser", response);
            return "redirect:/board/list.hanwha";
        } else {
            attr.addFlashAttribute("failMsg", "아이디 또는 비밀번호를 잘못 입력하셨습니다");
        }
        return "redirect:/";
    }

    @GetMapping("/logout.hanwha")
    public String logout(HttpSession session) {
        System.out.println("UserController.logout");
//        session.invalidate();
//        return "redirect:/";
        return null;
    }

    @GetMapping("/join.hanwha")
    public String joinForm() {
        System.out.println("UserController.joinForm");
        return "join";
    }

    @PostMapping("/join.hanwha")
    public String join(@Valid UserRequest params,
                       BindingResult bindingResult,
                       Model model /*,
                       RedirectAttributes attr*/) {
        System.out.println("debug UserController client POST path /user/join.hanwha");
        /*
        실습 구현
        step 01) 유효성 체크 검증을 통과하지 못하면 에러메시지를 join.jsp 보내서 출력
        step 02) 유효성 체크 후 검증을 통과하면 serice registr();
        step 03) UserMapper - insertRow() - UserMapper.xml<insert id="">
        step 04) 화면분기는 /
         */

        if (bindingResult.hasErrors()){
            //attr.addFlashAttribute("errorMsg", "유효성 체크 검증 실패");
            List<ObjectError> list = bindingResult.getAllErrors();
            Map<String, String> map = new HashMap<>();
            for(ObjectError ob : list){
                FieldError field = (FieldError) ob;
                String msg = ob.getDefaultMessage();
                System.out.println(">>>>>>>>>>>>>");
                System.out.println(field + " :::: " + msg);
                System.out.println(">>>>>>>>>>>>>");
                model.addAttribute(field.getField(), msg);
            }
            return "join";
        }
        System.out.println("debug >>>>> 유효성 검증 통과");

        // 비밀번호 암호화
        System.out.println("debug >>>> passwordEncoder , " + passwordEncoder);
        String encodePwd = passwordEncoder.encode(params.getPwd());
        System.out.println("encodePwd " + encodePwd);
        params.setPwd(encodePwd);
        userService.register(params);
        return "redirect:/" ;
    }

}
