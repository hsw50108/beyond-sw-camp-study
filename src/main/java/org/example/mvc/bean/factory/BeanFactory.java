package org.example.mvc.bean.factory;

import org.example.mvc.model.dao.MariaDao;
import org.example.mvc.model.dao.MvcDao;
import org.example.mvc.service.util.MvcService;
import org.example.mvc.service.util.MvcServiceImpl;
import org.example.mvc.user.controller.DeleteController;
import org.example.mvc.user.controller.JoinController;
import org.example.mvc.user.controller.LoginController;
import org.example.mvc.user.controller.UpdateController;
import org.example.mvc.user.controller.util.Controller;
import org.example.test.controller.IndexController;

import java.util.HashMap;
import java.util.Map;

/*
MVC Pattern 에서
FrontController 와 실제 Controller 사이에서 동작한다.
 */
public class BeanFactory {
    private Map<String, Controller> map;
    private static BeanFactory instance;
    private MvcService mvcService;
    private MvcDao mvcDao;

    // join.hanwha, login.hanwha, update.hanwha, delete.hanwha
    private BeanFactory() {
        mvcDao = new MariaDao();
        mvcService = new MvcServiceImpl(mvcDao);
        map = new HashMap<>();
        map.put("/index.hanwha", new IndexController(mvcService));
        map.put("/join.hanwha", new JoinController(mvcService));
        map.put("/login.hanwha", new LoginController(mvcService));
        map.put("/update.hanwha", new UpdateController(mvcService));
        map.put("/delete.hanwha", new DeleteController(mvcService));
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
