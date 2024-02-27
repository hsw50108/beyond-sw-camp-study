package org.example.mvc.user.controller;

import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

public class JoinController implements Controller {
    @Override
    public View execute() {
        System.out.println("JoinController.execute");
        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("/join/join1.jsp");
        return view;
    }
}
