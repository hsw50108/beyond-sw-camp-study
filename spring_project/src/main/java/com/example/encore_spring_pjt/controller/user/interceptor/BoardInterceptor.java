package com.example.encore_spring_pjt.controller.user.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class BoardInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("BoardInterceptor.preHandle");
        log.info("BoardInterceptor.preHandle");

        HttpSession session = request.getSession();
        if (session.getAttribute("loginUser") == null) {
            response.sendRedirect("/");
        }

        return true;
    }
}
