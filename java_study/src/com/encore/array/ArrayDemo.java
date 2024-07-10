package com.encore.array;

import java.util.Scanner;

public class ArrayDemo {
    public ArrayDemo() {
    }

    // Scanner 를 이용해서 5명 학생들의 국어점수만 입력받은 점수를 배열에 담아서 반환
    public int[] getKoreanScore() {
        int[] scores = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생의 국어 점수를 입력해주세요 : ");
            scores[i] = scanner.nextInt();
        }
        return scores;
    }

    public void scorePrint(int[] koreanScoreArray) {
        int sum = 0, average = 0;
        for (int i = 0; i < koreanScoreArray.length; i++) {
            sum += koreanScoreArray[i];
        }
        System.out.println("sum " + sum);
        average = sum / koreanScoreArray.length;
        System.out.println("average " + average);
    }


}
