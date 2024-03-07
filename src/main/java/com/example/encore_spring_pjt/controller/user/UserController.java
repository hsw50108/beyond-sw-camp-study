package com.example.encore_spring_pjt.controller.user;

import com.example.encore_spring_pjt.controller.user.domain.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login.hanwha")
    public String login(UserRequest param) {
        System.out.println("UserController.login");

        System.out.println("param value : " + param.getId());
        System.out.println("param value : " + param.getPwd());

        return "redirect:/board/list.hanwha";
    }

    /*@PostMapping("/login.hanwha")
    public String login(String id, String pwd) {
        System.out.println("UserController.login");
        System.out.println("param value : " + id);
        System.out.println("param value : " + pwd);
        return null;
    }*/

    /*@PostMapping("/login.hanwha")
    public String login(@RequestParam(name = "id") String id,
                        @RequestParam(name = "pwd") String pwd) {
        System.out.println("UserController.login");
        System.out.println("param value : " + id);
        System.out.println("param value : " + pwd);
        return null;
    }*/
}
