package com.encore.loop;

import java.util.Scanner;

/*
while(조건식){
    statement;
    [증감식 or 분기문]
}
증감식값이 없으면 무한루프
필요에 따라서 while(true) 무한 반복을 유도

초기값;
do{
 statement;
 [증감식 or 분기문]
}while(조건식);

 */
public class LoopDemo02 {
    // default constructor
    public LoopDemo02() {
    }

    //Q. 1 ~ 난수(6)까지의 합을 구해보고 싶다.
    public void sumRandom() {
        int nan = (int) (Math.random() * 100 + 1);
        System.out.println("nan = " + nan);

        int sum = 0;

        for (int i = 1; i <= nan; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    //Q. 난수 두 개를 발생시켜서 최소값부터 최대값까지의 합을 구하세요
    public void sumRandom2() {
        int randomNumber1 = (int) (Math.random() * 100 + 1);
        int randomNumber2 = (int) (Math.random() * 100 + 1);

        int totalRandomNumber = 0;
        if (randomNumber1 > randomNumber2) {
            for (int i = randomNumber2; i <= randomNumber1; i++) {
                totalRandomNumber += i;
            }
        }
        if (randomNumber2 > randomNumber1) {
            for (int i = randomNumber1; i <= randomNumber2; i++) {
                totalRandomNumber += i;
            }
        }
        System.out.println(totalRandomNumber);
    }

    //Q. A ~ Z 출력하는 구문을 작성
    public void charPrint(char start, char end) {
        for (char idx = start; idx <= end; idx++) {
            // %c 사용
            System.out.printf("%c\t", idx);
        }
    }

    //Q. 1 ~ 100 사이의 홀수의 합을 출력
    public void sumOdd() {
        // 1. idx += 2
        // 2. idx = idx +2
        int sum = 0;
        for (int idx = 1; idx <= 100; idx++) {
            if (idx % 2 != 0) {
                sum += idx;
            }
        }
        System.out.println("sum : " + sum);
    }

    //Q. 1 ~ 100 난수 발생시켜서 짝수의 개수만 몇 개인지 출력
    public void randomEvenCount() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println(randomNumber);

        int count = 0;
        for (int i = 1; i <= randomNumber; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.printf("짝수의 개수는 %d개 입니다.", count);
    }

    //Q. 매개변수로 문자열 입력받아서 문자 하나씩을 추출하여 출력
    public void splitString(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + "\t");
        }

    }

    //Q. 스캐너를 이용해서 값을 입력받고 1부터 차례로 누적하여 합을 구하다가 입력한 값을 넘으면 중단하고
    //   마지막으로 더해진 값과 그 때까지의 합을 출력
    public void sumBreak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("데이터를 입력하세요 : ");
        int number = scanner.nextInt();

        int idx = 0;
        int sum = 0;

        for (idx = 1; ; idx++) {
            if (sum > number) {
                break;
            }
            sum += idx;
        }
        System.out.println(idx - 1 + "\t" + sum);
    }

    public void nestedFor() {
        for (int row = 1; row <= 10; row++) {
//            System.out.println("row idx = " + row);
            for (int col = 1; col <= 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 구구단
    public void gugudan() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf(">>> %d 단 <<< \t", dan);
            System.out.println();
            for (int number = 1; number <= 9; number++) {
                System.out.println(dan + " * " + number + " = " + (dan * number));
            }
        }
    }

    public void gugudanTable() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf(">>> %d 단 <<< \t", dan);
            System.out.println();
            gugudanTimes(dan);
        }
    }

    private void gugudanTimes(int dan) {
        for (int number = 1; number <= 9; number++) {
            System.out.println(dan + " * " + number + " = " + (dan * number));
        }
        System.out.println();
    }

    // i, j 변수만 출력(5 * 5)
    public void printIJ() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
//                System.out.println("row = " + i + ", col = " + j);
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    출력예시)
    23456
    34567
    45678
    56789
    678910
     */
    public void forLine() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }

    // break, continue
    // break    : 가장 가까운 루프구문을 빠져나가는 것.
    // continue : 조건에 만족할 경우 실행을 하지않고 다음 차례로 이동
    public void gugudan2() {
        for (int dan = 1; dan <= 9; dan++) {
//            System.out.printf(">>> %d 단 <<< \t", dan);
//            System.out.println();
            for (int number = 2; number <= 9; number++) {
                if (number > 5) {
                    break;
                }
                System.out.print(number + " * " + dan + " = " + (dan * number) + "\t");

            }
            System.out.println();
        }
    }

    public void forLabel() {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break outer;
                }
                System.out.println("i, j = " + i + "\t" + j);
            }
        }
    }

    // while
    public void whileOneToTen() {
        int idx = 1;
        while (idx <= 10) {
            System.out.println(idx + "\t");
            idx++;
        }
    }

    //Q. 스캐너로부터 문자열을 입력받아서 for, while 구문으로 입력된 문자열의 각 문자의 인덱스와 문자를 쌍으로 출력
    /*
        입력예시) java
        출력예시)
        0 : j
        1 : a
        2 : v
        3 : a
     */
    public void printStrIdx() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력해주세요 : ");
        String str = scanner.nextLine();
        System.out.println(">>> for <<<");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + "\t" + " : " + str.charAt(i));
        }

        System.out.println(">>> while <<<");

        int idx = 0;
        while (idx < str.length()) {
            System.out.println(idx + "\t" + " : " + str.charAt(idx));
            idx++;
        }
    }

    public void doWhileTest() {
        System.out.println("do ~ while");
        do {
            System.out.println("false 이지만 한번은 무조건 수행 do while");
        } while (false);
    }

}
