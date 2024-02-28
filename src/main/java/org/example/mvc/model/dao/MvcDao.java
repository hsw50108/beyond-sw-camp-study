package org.example.mvc.model.dao;

import org.example.mvc.domain.dto.RequestUserDTO;
import org.example.mvc.domain.dto.ResponseUserDTO;

public interface MvcDao {
    void joinRow();

    ResponseUserDTO loginRow(RequestUserDTO params);

    void updateRow();

    void deleteRow();
}
