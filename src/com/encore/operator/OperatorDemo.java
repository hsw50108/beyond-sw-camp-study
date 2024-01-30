package com.encore.operator;

import java.util.Scanner;
public class OperatorDemo {
    public OperatorDemo() {}

    // example01 반환값 x, 매개변수 x
    public void example01() {
        System.out.println(">>> 산술 연산");
        int x = 100, y = 100, result = 0;
        System.out.println(" + : " + x + y); // 연산자 우선순위 -> 문자열도 합쳐져버림
        System.out.println(" + : " + (x + y));
        System.out.println(" - : " + (x - y));
        System.out.println(" * : " + (x * y));
        System.out.println(" / : " + (x / y));
        System.out.println(" % : " + (x % y));
    }

    // example02 반환값 x, 매개변수 x
    public String example02(String color01, String color02) {
        System.out.println(">>> 연결 연산");
        return "신호등의 색깔은 " + color01 + "과 " + color02 + " 입니다";
    }

    public void example03() {
        System.out.println(">>> 논리 연산");
        boolean isFlag = false;
        System.out.println("논리 부정, " + !isFlag);

        //scanner 로 부터 입력받은 숫자가 짝수인지 아닌지 확인
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 :");
        int number = scanner.nextInt();
        System.out.println((number % 2 == 0) ? "짝수" : "홀수");
        //scanner 로 부터 입력받은 숫자가 3의 배수인지 확인
        System.out.println((number % 3 == 0) ? "3의 배수" : "3의 배수가 아님");
        //scanner 로 부터 입력받은 숫자가 양수인지 아닌지 확인
        System.out.println((number > 0) ? "양수" : (number < 0) ? "음수" : "0");

        /*if (number % 2 == 0) {
            isFlag = true;
            System.out.println("짝수 입니다.");
        } else {
            isFlag = false;
            System.out.println("홀수 입니다.");
        }*/
    }
    public void example04() {
        System.out.println(">>> 증감연산");

        int age = 50;
        System.out.println("현재 나이는 " + age);
        System.out.println(++age); // age = age + 1 이후 print
        System.out.println("현재 나이는 " + age);
        System.out.println(age++); // print 후 age = age + 1

        System.out.println();
        int number = 20;
        int result = number++ * 3;
        System.out.println(result);
    }

    public void example05() {
        System.out.println(">>> 일반논리연산");

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int number = scanner.nextInt();

        //scanner 로 부터 입력받은 숫자가 1 ~ 100 사이값인지 판단
        System.out.println("1 ~ 100 : " + (number >= 1 && number <= 100));

    }

    public void example06() {
        System.out.println(">>> 일반논리연산");

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 :");
        char str = scanner.next().charAt(0);

        //scanner 로 부터 입력받은 문자하나를 A ~ Z 대문자인지 판단
        System.out.println("input char , " + (str));

        System.out.println("A ~ Z : " + (str >= 'A' && str <= 'Z'));
    }

    public void example07() {
        System.out.println(">>> 삼항 연산자");
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // 입력받은 숫자가 양수인지 음수인지 0인지
        System.out.println(number > 0 ? "양수" : number < 0 ? "음수" : "0입니다.");



    }
}