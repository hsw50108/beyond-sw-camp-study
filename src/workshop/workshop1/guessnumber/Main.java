package workshop.workshop1.guessnumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputNumber = GuessGame.getUserInput();
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 기회입니다. 숫자를 입력하세요 : ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();

            if (userNumber == inputNumber) {
                System.out.println("축하합니다. " + i + "번 만에 맞추셨네요");
                return;
//                break;
            }

            if (userNumber > inputNumber) {
                System.out.println(userNumber + "보다 작습니다.");
            } else {
                System.out.println(userNumber + "보다 큽니다.");
            }
            count++;

            if (count == 10) {
                System.out.println("10번의 기회가 끝났습니다. 다시 한 번 시도해 보세요.");
            }
        }



    }
}
