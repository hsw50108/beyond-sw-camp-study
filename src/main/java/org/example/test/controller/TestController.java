package org.example.test.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/test.encore")
public class TestController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("debug >>> TestController do Get Method");
        /*PrintWriter out = response.getWriter();
        out.println("<div align=\"center\"> Web Application Programming(Servlet/JSP)</div>\n");
        out.close();*/

        // 화면분기                                                 jdbc, orm
        // browser ------> controller -------> service -------> dao -------> dbms

        // 분기 첫번째 방식 -> redirect(); 잘 사용하지 않음
//        response.sendRedirect("./test.jsp");

        // 분기 두번째 방식 -> forward() : 스프링부트 권장하는 방식
        RequestDispatcher view = request.getRequestDispatcher("./test.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }


}
