package org.example.mvc.user.controller;

import org.example.mvc.user.controller.util.Controller;

public class LoginController implements Controller {
    @Override
    public void execute() {
        System.out.println("LoginController.execute");
    }
}
