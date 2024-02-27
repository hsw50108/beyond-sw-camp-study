package org.example.mvc.front.controller;

import org.example.mvc.bean.factory.BeanFactory;
import org.example.mvc.user.controller.util.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.hanwha")
public class DispatcherController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("debug >>> FrontController process ");
        System.out.println("client request path : " + request.getRequestURI());

//        BeanFactory beanFactory = new BeanFactory();
        BeanFactory beanFactory = BeanFactory.getInstance();
        Controller controller = beanFactory.getController(request.getRequestURI());
        controller.execute();


    }


}
