package com.encore.vending;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class VendingMachine {
    private static final int COLA = 800;
    private static final int WATER = 500;
    private static final int VITAMIN_WATER = 1500;

    private String type;

    public void init() {
        switch (getType()) {
            case "if":
                ifVending();
                break;
            case "switch":
                switchVending();
                break;
        }
    }

    private void ifVending() {
        System.out.println(">>> if 구현");
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int money = scanner.nextInt();

        System.out.println("메뉴를 골라주세요");
        System.out.println("1. 콜라(800원), 2. 생수(500원), 3. 비타민원터(1500원) : ");
        int number = scanner.nextInt();


        int changes = 0;
        if (number == 1) {
            changes = money - COLA;
            if (money < 800) {
                System.out.println("돈이 부족합니다.");
            }
        } else if (number == 2) {
            changes = money - WATER;
            if (money < 800) {
                System.out.println("돈이 부족합니다.");
            }
        } else if (number == 3) {
            changes = money - VITAMIN_WATER;
            if (money < 800) {
                System.out.println("돈이 부족합니다.");
            }
        }

        System.out.println("잔돈 : " + changes + "원");

        // 잔돈 계산하기
        int 천원 = (changes / 1000);
        int 오백원 = (changes - (천원 * 1000)) / 500;
        int 백원 = (changes - ((천원 * 1000) + (오백원 * 500))) / 100;

        System.out.println("천원 : " + 천원 + "개, 오백원 : " + 오백원 + "개, 백원 " + 백원 + "개");
    }

    private void switchVending() {
        System.out.println(">>> switch 구현");
    }

}
