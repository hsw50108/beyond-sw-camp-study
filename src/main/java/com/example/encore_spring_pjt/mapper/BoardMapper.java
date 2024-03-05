package com.example.encore_spring_pjt.mapper;

import com.example.encore_spring_pjt.domain.BoardRequest;
import org.apache.ibatis.annotations.Mapper;

/*
* encore_board_tbl 과 CRUD 작업을 위한 추상메서드 선언
* mapper는 기존의 dao와 동일한 작업을 진행하는 것
* */
@Mapper
public interface BoardMapper {
    public void save(BoardRequest params);

}
