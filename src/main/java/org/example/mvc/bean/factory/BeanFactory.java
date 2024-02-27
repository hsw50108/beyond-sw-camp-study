package org.example.mvc.bean.factory;

import org.example.mvc.user.controller.DeleteController;
import org.example.mvc.user.controller.JoinController;
import org.example.mvc.user.controller.LoginController;
import org.example.mvc.user.controller.UpdateController;
import org.example.mvc.user.controller.util.Controller;

import java.util.HashMap;
import java.util.Map;

/*
MVC Pattern 에서
FrontController 와 실제 Controller 사이에서 동작한다.
 */
public class BeanFactory {
    private Map<String, Controller> map;
    private static BeanFactory instance;

    // join.hanwha, login.hanwha, update.hanwha, delete.hanwha
    private BeanFactory() {
        map = new HashMap<>();
        map.put("/join.hanwha", new JoinController());
        map.put("/login.hanwha", new LoginController());
        map.put("/update.hanwha", new UpdateController());
        map.put("/delete.hanwha", new DeleteController());
    }

    public static BeanFactory getInstance() {
        if (instance == null) {
            instance = new BeanFactory();
        }
        return instance;
    }

    public Controller getController(String clientPath) {
        return map.get(clientPath);
    }


}
