package com.example.encore_spring_pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(path = "/index.hanwha", method = RequestMethod.GET)
    public String index() {
        System.out.println("IndexController.index");
        return "index";
    }

}
