package org.example.mvc.user.controller;

import org.example.mvc.domain.dto.RequestUserDTO;
import org.example.mvc.domain.dto.ResponseUserDTO;
import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        System.out.println("LoginController.execute");
        RequestUserDTO param = new RequestUserDTO(id, pwd);
        ResponseUserDTO responseUserDTO = mvcService.login(param);

        View view = new View();

        if (responseUserDTO != null) {
//            request.setAttribute("user", responseUserDTO); // request scope
            HttpSession session = request.getSession(); // session create
            session.setAttribute("user", responseUserDTO);

            view.setFlag(true);
            view.setResponseJsp("./main.jsp");
            return view;
        } else {
            view.setFlag(true);
            view.setResponseJsp("./error.jsp");
            return view;
        }
    }
}
