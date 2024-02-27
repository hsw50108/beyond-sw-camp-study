package org.example.mvc.user.controller;

import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

public class UpdateController implements Controller {
    private MvcService mvcService;

    public UpdateController() {
    }

    public UpdateController(MvcService mvcService) {
        this.mvcService = mvcService;
    }

    @Override
    public View execute() {
        System.out.println("UpdateController.execute");

        View view = new View();

        view.setFlag(true);
        view.setResponseJsp("/update/update.jsp");

        mvcService.update();
        return view;
    }
}
