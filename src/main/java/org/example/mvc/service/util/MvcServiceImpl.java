package org.example.mvc.service.util;

import org.example.mvc.domain.dto.RequestUserDTO;
import org.example.mvc.domain.dto.ResponseUserDTO;
import org.example.mvc.model.dao.MvcDao;

import java.util.List;

public class MvcServiceImpl implements MvcService {

    MvcDao mvcDao;

    public MvcServiceImpl(MvcDao mvcDao) {
        this.mvcDao = mvcDao;
    }

    @Override
    public void join() {
        System.out.println("MvcServiceImpl.join");
    }

    @Override
    public ResponseUserDTO login(RequestUserDTO requestUserDTO) {
        System.out.println("MvcServiceImpl.login");
        return mvcDao.loginRow(requestUserDTO);
    }


    @Override
    public void update() {
        System.out.println("MvcServiceImpl.update");
    }

    @Override
    public void delete() {
        System.out.println("MvcServiceImpl.delete");
    }

    @Override
    public List<ResponseUserDTO> select() {
        System.out.println("debug >>> service delete()");
        return mvcDao.selectRow();
    }
}
