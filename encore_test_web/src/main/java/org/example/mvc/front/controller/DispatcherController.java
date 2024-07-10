package org.example.mvc.front.controller;

import org.example.mvc.bean.factory.BeanFactory;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.RequestDispatcher;
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

        BeanFactory factory = BeanFactory.getInstance();
        Controller controller = factory.getController(request.getRequestURI());
        View view = controller.execute(request, response);

        if (view.isFlag()) {
            RequestDispatcher rd = request.getRequestDispatcher(view.getResponseJsp());
            rd.forward(request, response);
        } else {
            response.sendRedirect(view.getResponseJsp());
        }
    }

}
