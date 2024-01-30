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
            System.out.println("4.exit");

            System.out.print("input number : ");
            int number = scanner.nextInt();

            if (number == 0) {

            }

            if (number == 4) {
                System.exit(0);
            }

            if (number == 3) {
                requestSave();
            }
        }
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
