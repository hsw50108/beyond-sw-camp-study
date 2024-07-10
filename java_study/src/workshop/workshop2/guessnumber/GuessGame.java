package workshop.workshop2.guessnumber;

import java.util.Random;

public class GuessGame {

    public static int getUserInput() {
        System.out.println("***********************************");
        System.out.println("10번의 기회가 있습니다.");
        System.out.println("1에서 100사이의 숫자를 맞춰보세요.");
        System.out.println("***********************************");

        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
