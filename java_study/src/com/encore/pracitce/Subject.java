package com.encore.pracitce;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Subject {

    private int KOREAN;
    private int ENGLISH;
    private int MATH;

    // 총점
    public void totalScore() {
        int totalScore = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("국어 점수를 입력해주세요 : ");
        int korean = scanner.nextInt();

        System.out.print("영어 점수를 입력해주세요 : ");
        int english = scanner.nextInt();

        System.out.print("수학 점수를 입력해주세요 : ");
        int math = scanner.nextInt();

        totalScore = korean + english + math;
        int average = average(totalScore);

        if (average >= 60 && korean >= 40 && english >= 40 && math >= 40) {
            System.out.println("합격입니다.");
        } else {
            if (average < 60){
                System.out.println("평균 점수 미달로 불합격");
            }
            if (korean < 40){
                System.out.println("국어 점수 미달로 불합격");
            }
            if (english < 40){
                System.out.println("영어 점수 미달로 불합격");
            }
            if (math < 40){
                System.out.println("수학 점수 미달로 불합격");
            }
        }
    }
    // 평균
    public int average(int totalScore) {
        return totalScore / 3;
    }




}
