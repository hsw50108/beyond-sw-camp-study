package com.example.encore_spring_pjt.mapper;

import com.example.encore_spring_pjt.domain.BoardRequest;
import com.example.encore_spring_pjt.domain.BoardResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/*
 * encore_board_tbl 과 CRUD 작업을 위한 추상메서드 선언
 * mapper는 기존의 dao와 동일한 작업을 진행하는 것
 * */
@Mapper
public interface BoardMapper {
    void save(BoardRequest params);
    Optional<BoardResponse> findByIdx(BoardRequest params);
    void updateByIdx(BoardRequest params);
    // 레코드 건수 확인
    int count();
    // soft delete
    void deleteByIdx(BoardRequest params);
    // select (multi finder)
    List<BoardResponse> findAll();
    // 조회수 증가 메서드
    void updateViewCnt(BoardRequest params);
}
