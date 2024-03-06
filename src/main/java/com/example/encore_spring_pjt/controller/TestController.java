package com.example.encore_spring_pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
