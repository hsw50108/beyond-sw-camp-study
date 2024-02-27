package org.example.mvc.service.util;

public class MvcServiceImpl implements MvcService {
    @Override
    public void join() {
        System.out.println("MvcServiceImpl.join");
    }

    @Override
    public void login() {
        System.out.println("MvcServiceImpl.login");
    }

    @Override
    public void update() {
        System.out.println("MvcServiceImpl.update");
    }

    @Override
    public void delete() {
        System.out.println("MvcServiceImpl.delete");
    }
}
