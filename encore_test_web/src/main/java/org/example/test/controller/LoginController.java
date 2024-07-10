package org.example.test.controller;

import org.example.test.domain.dto.TestDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

//        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");
        System.out.println("id = " + id);
        System.out.println("password = " + password);

        if (id.equals("encore") && password.equals("encore")) {
            TestDto params = new TestDto();

            params.setId(id);
            params.setPassword(password);
            params.setName("엔코아");

            // scope 은 forward 되어지는 페이지까지만 데이터를 유지할 수 있다.
//            request.setAttribute("user", params);

            HttpSession session = request.getSession();
            session.setAttribute("user", params);

            RequestDispatcher view = request.getRequestDispatcher("./ok.jsp");
            view.forward(request, response);

            // 상태 유지 안 됨
//            response.sendRedirect("./ok.jsp");
        } else {
            RequestDispatcher view = request.getRequestDispatcher("./error.jsp");
            view.forward(request, response);
        }

//        if ("encore".equals(id) && "encore".equals(password)) {
//
//        }


    }


}
