import com.encore.control.ControlStatementDemo;

import java.util.Scanner;

/**
 * 제어구문(if, switch)
 * - 논리값을 가지고 조건판단
 */
public class ControlStatementMain {
    public static void main(String[] args) {
//        evenCheck();
        ControlStatementDemo controlStatementDemo = new ControlStatementDemo();
        String message = controlStatementDemo.woodMan();
        System.out.println(message);

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
