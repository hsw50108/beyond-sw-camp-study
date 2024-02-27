package org.example.mvc.user.controller;

import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

public class DeleteController implements Controller {
    @Override
    public View execute() {
        System.out.println("DeleteController.execute");
        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("/delete/delete.jsp");
        return view;
    }

}
