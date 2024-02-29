package org.example.mvc.user.controller;

import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 사용자 명시적인 로그아웃이 요청되면
 * 사용자 브라우저에 부여한 모든 세션을 클리어시키는 역할
 */
public class LogoutController implements Controller {

    private MvcService mvcService;

    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("LogoutController.execute");

        HttpSession session = request.getSession(false);
        session.invalidate();

        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("./index.jsp");

        return view;
    }
}
