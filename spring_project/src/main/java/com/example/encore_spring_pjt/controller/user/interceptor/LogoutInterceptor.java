package com.example.encore_spring_pjt.controller.user.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LogoutInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("LogoutInterceptor.preHandle");

        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("/");
        return false;
    }
}
