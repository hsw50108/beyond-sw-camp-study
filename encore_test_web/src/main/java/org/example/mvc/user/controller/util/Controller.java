package org.example.mvc.user.controller.util;

import org.example.mvc.util.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    View execute(HttpServletRequest request, HttpServletResponse response);

}
