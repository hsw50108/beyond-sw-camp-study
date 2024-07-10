package org.example.test.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebFilter("/*")
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("컨트롤러의 서비스 메서드 수행 전");
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response); // controller -> service() (doGet, doPost)
//        System.out.println("컨트롤러의 서비스 메서드 수행 후");
    }

    @Override
    public void destroy() {

    }
}
