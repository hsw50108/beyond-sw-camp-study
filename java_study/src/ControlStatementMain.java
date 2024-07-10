import com.encore.control.ControlStatementDemo;

import java.util.Scanner;

/**
 * 제어구문(if, switch)
 * if(논리값 | 논리식)
 * - 논리값을 가지고 조건판단
 */

/*
비교할 변수에 들어갈 타입(byte, short, char, int, String, enum)
switch(비교할 변수){
    case 비교할 값 :
      statement;
      break;
    case 비교할 값 :
      statement;
      break;
    .
    .
    .
    default : -- 조건에 만족하는 케이스가 없을 떄 수행하는 영역
      statement;
 */
public class ControlStatementMain {
    public static void main(String[] args) {
//        evenCheck();
        ControlStatementDemo controlStatementDemo = new ControlStatementDemo();
//        String message = controlStatementDemo.woodMan();
//        System.out.println(message);

        double value = controlStatementDemo.calc(100, '+', 100);
        System.out.println("Result >>>" + value);

    }
    public static void evenCheck() {
        // Scanner 부터 숫자 하나를 입력받아서 양수이면서 짝수인지 아닌지를 판단하고 싶다면? - 짝수 또는 홀수
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수");
            if (number % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } else {
            System.out.println("음수");
            System.out.println("양수를 넣지 않아서 프로그램을 종료합니다.");
            System.exit(0);
        }

        /*if (number % 2 == 0) {
            System.out.println(number + " : 짝수입니다.");
        } else {
            System.out.println(number + " : 홀수입니다.");
        }*/
    }
}
