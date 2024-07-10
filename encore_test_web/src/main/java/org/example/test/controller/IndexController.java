package org.example.test.controller;

import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IndexController implements Controller {
    private MvcService service;

    public IndexController() {
    }

    public IndexController(MvcService service) {
        this.service = service;
    }

    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("debug >>> IndexController execute() ");
        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("./main.jsp");
        return view;
    }
}
