package org.example.mvc.user.controller;

import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {
    private MvcService mvcService;

    public LoginController() {
    }

    public LoginController(MvcService mvcService) {
        this.mvcService = mvcService;
    }

    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("LoginController.execute");

        View view = new View();

        view.setFlag(true);
        view.setResponseJsp("/login/login.jsp");

        mvcService.login();
        return view;
    }
}
