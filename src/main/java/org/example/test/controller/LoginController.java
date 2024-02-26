package org.example.test.controller;

import org.example.test.domain.dto.TestDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login.encore")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }
    protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("client uri : " + request.getRequestURI());
        System.out.println("client query string : " + request.getQueryString());
        System.out.println("client method : " + request.getMethod());

        String id = request.getParameter("id");
        String password = request.getParameter("password");

        if (id.equals("encore") && password.equals("encore")) {
            TestDto params = new TestDto();

            params.setId(id);
            params.setPassword(password);
            params.setName("엔코아");

            request.setAttribute("user", params);

            RequestDispatcher view = request.getRequestDispatcher("./ok.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("./error.jsp");
            view.forward(request, response);
        }

//        if ("encore".equals(id) && "encore".equals(password)) {
//
//        }

    }



}
