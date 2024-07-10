package com.encore.vending;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@Getter
@RequiredArgsConstructor
public class VendingMachineGuide {
    private static final int COLA = 800;
    private static final int WATER = 500;
    private static final int VITAMIN_WATER = 1500;

    private final String type;

    private int money;
    private int number;

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

    private void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        money = scanner.nextInt();

        System.out.println("메뉴를 골라주세요");
        System.out.println("1. 콜라(800원), 2. 생수(500원), 3. 비타민원터(1500원) : ");
        number = scanner.nextInt();
    }

    private void ifVending() {
        System.out.println(">>> if 구현");
        menu();
        if (number == 1 && money >= COLA) {
            money -= COLA;
        } else if (number == 2 && money >= WATER) {
            money -= WATER;
        } else if (number == 3 && money >= VITAMIN_WATER) {
            money -= VITAMIN_WATER;
        } else {
            System.out.println("잔액이 부족합니다.");
        }

        System.out.println("잔돈 : " + money + "원");

        System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개",
                (money / 1000),
                ((money % 1000) / 500),
                (((money % 1000) % 500) / 100)
        );
    }

    private void switchVending() {
        System.out.println(">>> switch 구현");
        menu();
        int price = switch (number) {
            case 1 -> COLA;
            case 2 -> WATER;
            case 3 -> VITAMIN_WATER;
            default -> 0;
        };

        if (money < price) {
            System.out.println("잔액이 부족합니다.");
        } else {
            money -= price;
        }

        System.out.println("잔돈 : " + money + "원");

        System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개",
                (money / 1000),
                ((money % 1000) / 500),
                (((money % 1000) % 500) / 100)
        );
    }
}
