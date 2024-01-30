package com.encore.post.service;

import com.encore.post.domain.PostRequestDto;

import java.time.LocalDateTime;

// xxxService, xxxServiceImpl 비지니스 로직을 처리하는 역할을 담당
// 시나리오
// 사용자가 블로그에 글 작성(savePost), 수정, 삭제, 검색, 읽기
// 아이디, 제목, 내용, 등록일, 조회수, 공개/비공개
public class PostService {



    public String savePost(String id, String title, String content, LocalDateTime registerDate, int view, boolean isPublic) {
        System.out.println("debug >>>> working method completed..");
        return "작성하신 글이 저장되었습니다.";
    }


    public String savePost(PostRequestDto request) {
        System.out.println("debug >>>> working method completed..");
        return request.getId() + "님이 작성하신 글이 저장되었습니다.";
    }

    public String deletePost(PostRequestDto request) {
        System.out.println("debug >>>> working method completed..");
        return request.getId() + "님이 작성하신 글이 삭제 되었습니다.";
    }
}
