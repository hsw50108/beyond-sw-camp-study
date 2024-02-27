package org.example.mvc.user.controller;

import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

public class UpdateController implements Controller {
    @Override
    public View execute() {
        System.out.println("UpdateController.execute");
        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("/update/update.jsp");
        return view;
    }
}
