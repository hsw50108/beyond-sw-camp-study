package org.example.mvc.user.controller;

import org.example.mvc.domain.dto.RequestUserDTO;
import org.example.mvc.domain.dto.ResponseUserDTO;
import org.example.mvc.service.util.MvcService;
import org.example.mvc.user.controller.util.Controller;
import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class SelectController implements Controller {

    private MvcService mvcService;

    public SelectController(MvcService mvcService) {
        this.mvcService = mvcService;
    }

    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("SelectController.execute");
        List<ResponseUserDTO> list = mvcService.select();

        // 아래 출력 결과는 JSP를 이용해서 브라우저에 출력
        for (ResponseUserDTO dto : list) {
            System.out.println(dto);
        }

        // 데이터를 심어보자
        request.setAttribute("list", list);

        View view = new View();
        view.setFlag(true);
        view.setResponseJsp("../list/list.jsp");
        return view;
    }
}
