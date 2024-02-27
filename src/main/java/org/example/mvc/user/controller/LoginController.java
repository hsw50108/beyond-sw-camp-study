package org.example.mvc.user.controller;

import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

public class LoginController implements Controller {
    @Override
    public View execute() {
        System.out.println("LoginController.execute");
        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("/login/login.jsp");
        return view;
    }
}
