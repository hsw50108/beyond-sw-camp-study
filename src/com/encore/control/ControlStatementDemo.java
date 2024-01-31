package com.encore.control;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class ControlStatementDemo {

    /**
     * if 조건식
     * A 또는 B 라는 값을 기대할 수 있다.
     * 조건식에 대한 값이 true 이면 if문 안의 내용을 실행하고 false 이면 else문 안의 내용을 수행
     */

    // 메뉴구성(1. 금도끼 2. 은도끼 3. 쇠도끼)
    // 조건 1) 입력숫자는 1 ~ 3 사이
    // 조건 2) 1번 선택시 '거짓말을 하는구나 아무 도끼도 줄 수 없다.'
    // 조건 3) 2번 선택시 '또 거짓말을 하는구나 아무 도끼도 줄 수 없다.'
    // 조건 4) 3번 선택시 '정직하구나 너에게 모든 도끼를 주겠다.'
    // 조건 5) 조건 판단이 끝나면 산신령은 연못으로 사라진다.
    public String woodMan() {
        String answer = "";
        System.out.println("== 메뉴구성");

        System.out.println("1. 금도끼, 2. 은도끼, 3. 쇠도끼");
        System.out.print("도끼를 선택해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            answer = "거짓말을 하는구나 아무 도끼도 줄 수 없다.";
        } else if (number == 2) {
            answer = "또 거짓말을 하는구나 아무 도끼도 줄 수 없다.";
        } else if (number == 3) {
            answer = "정직하구나 너에게 모든 도끼를 주겠다.";
        } else {
            System.out.println("1 ~ 3번 중에 선택할 수 있습니다.");
        }
        answer = answer.concat("\n산신령은 연못으로 사라진다.");

        return answer;
    }




}
