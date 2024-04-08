package org.example.mvc.user.controller;

import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// test
public class DeleteController implements Controller {
    private MvcService mvcService;

    public DeleteController(MvcService mvcService) {
        this.mvcService = mvcService;
    }


    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("DeleteController.execute");

        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("/delete/delete.jsp");

        mvcService.delete();

        return view;
    }

}
