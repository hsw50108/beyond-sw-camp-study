package com.example.encore_spring_pjt.controller.jpa.controller;

import com.example.encore_spring_pjt.controller.jpa.domain.JpaEntity;
import com.example.encore_spring_pjt.controller.jpa.service.JpaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
@RequiredArgsConstructor
public class JpaTestController {

    private final JpaService jpaService;

    // 전체 리스트 조회
    @GetMapping("/list")
    public ResponseEntity<List<JpaEntity>> getList() {
        System.out.println("JpaTestController.getList");
        List<JpaEntity> list = jpaService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<JpaEntity> save(@RequestBody JpaEntity entity) {
        System.out.println("JpaTestController.save");
        JpaEntity jpaEntity = jpaService.save(entity);
        return new ResponseEntity<>(jpaEntity, HttpStatus.OK);
    }

    // 삭제 - PathVariable
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        System.out.println("JpaTestController.delete");
        jpaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{seq}")
    public ResponseEntity<Optional<JpaEntity>> find(@PathVariable("seq") Integer seq) {
        System.out.println("JpaTestController.find");

        Optional<JpaEntity> entity = jpaService.findByIdx(seq);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    // 기본키로 사용자 정보 수정
    // raw 데이터로
    @PutMapping("/update")
    public ResponseEntity<JpaEntity> updateUser(@RequestBody JpaEntity jpaEntity) {
        jpaService.update(jpaEntity);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // 이름으로 조회
    @GetMapping("/findName/{name}")
    public ResponseEntity<List<JpaEntity>> findUserByName(@PathVariable("name") String name) {
        List<JpaEntity> findUsers = jpaService.findByName(name);
        return new ResponseEntity<>(findUsers, HttpStatus.OK);
    }

    @GetMapping("/findByNameLike/{name}")
    public ResponseEntity<List<JpaEntity>> findByNameLike(@PathVariable("name") String name) {
        List<JpaEntity> findUsers = jpaService.findByNameLike(name);
        return new ResponseEntity<>(findUsers, HttpStatus.OK);
    }

}
