package com.example.encore_spring_pjt.controller.jpa.service;

import com.example.encore_spring_pjt.controller.jpa.dao.EncoreRepository;
import com.example.encore_spring_pjt.controller.jpa.domain.JpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JpaService {

    private final EncoreRepository encoreRepository;

    public List<JpaEntity> findAll() {
        System.out.println("JpaTestService.getList");

//        List<JpaEntity> list = new ArrayList<>();
//        encoreRepository.findAll()
//                .forEach(e -> list.add(e));

        return encoreRepository.findAll();
    }

    public JpaEntity save(JpaEntity entity) {
        System.out.println("JpaService.save");
        return encoreRepository.save(entity);
    }

    public void deleteById(Integer id) {
        System.out.println("JpaService.deleteById");
        encoreRepository.deleteById(id);
    }

    public Optional<JpaEntity> findByIdx(Integer seq) {
        System.out.println("JpaService.findByIdx");
//        Optional<JpaEntity> entity = encoreRepository.findById(seq);
        return encoreRepository.findByCustomerId(seq);
    }

    @Transactional
    public void update(JpaEntity jpaEntity) {
        Optional<JpaEntity> findMember = encoreRepository.findByCustomerId(jpaEntity.getSeq());

        if (findMember.isPresent()) {
            encoreRepository.updateEntity(jpaEntity.getId(), jpaEntity.getPwd(), jpaEntity.getName(), jpaEntity.getSeq());
//            encoreRepository.save(jpaEntity);
        } else {
            throw new RuntimeException("찾는 id가 없습니다.");
        }
    }

    public List<JpaEntity> findByName(String name) {
        return encoreRepository.findByName(name);
    }

    public List<JpaEntity> findByNameLike(String name) {

        return encoreRepository.findByNameLike("%"+name+"%");
    }
}
