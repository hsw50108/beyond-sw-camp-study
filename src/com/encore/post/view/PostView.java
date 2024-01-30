package com.encore.post.view;

import com.encore.post.domain.PostRequestDto;
import com.encore.post.service.PostService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PostView {

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(">>>> Hanwha software camp Beyond 5th");
            System.out.println("0.글 목록보기");
            System.out.println("1.login");
            System.out.println("2.join");
            System.out.println("3.post write");
            System.out.println("4.post delete");
            System.out.println("99.exit");

            System.out.print("input number : ");
            int number = scanner.nextInt();


            if (number == 99) {
                System.exit(0);
            }

            if (number == 3) {
                requestSave();
            }

            if (number == 4) {
                requestDelete();
            }
        }
    }

    // request delete
    // terminal 로 부터 사용자의 아이디만 입력을 받아서
    // 해당 아이디를 dto 에 담고
    // PostService 클래스에 정의된 postDelete(PostRequestDto params)
    // 메서드를 호출하여 '작성하신 글이 삭제 되었습니다.' 메시지를 반환 받아서 출력
    public void requestDelete() {
        Scanner scan = new Scanner(System.in);
        System.out.print("아이디 : ");
        String id = scan.nextLine();

        PostService postService = new PostService();
        PostRequestDto request = new PostRequestDto(id);
        String msg = postService.deletePost(request);
        System.out.println("result >>> " + msg);

    }

    public void requestSave() {
        System.out.println("PostView.requestSave");
        Scanner scan = new Scanner(System.in);
        System.out.print("아이디 : ");
        String id = scan.nextLine();

        System.out.print("제목 : ");
        String title = scan.nextLine();

        System.out.print("내용 : ");
        String content = scan.nextLine();

        System.out.print("조회수 : ");
        int views = scan.nextInt();

        System.out.print("공개여부 : ");
        boolean isFlag = scan.nextBoolean();

        PostService postService = new PostService();
        PostRequestDto request = new PostRequestDto(id, title, content, LocalDateTime.now(), views, isFlag);
        String msg = postService.savePost(request);
        System.out.println("result >>> " + msg);
    }

}
