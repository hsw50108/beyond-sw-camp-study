package workshop.workshop1.primenumber;

import java.util.Scanner;

public class ExercisePrimeNumber {

    // scanner 이용해서 사용자 값을 입력받아서 전달.
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextInt();
    }

}
