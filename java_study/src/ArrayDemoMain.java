import com.encore.array.ArrayDemo;

import java.util.Arrays;

public class ArrayDemoMain {
    public static void main(String[] args) {
        /*
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] koreanScoreArray = arrayDemo.getKoreanScore();

//        for (int i = 0; i < koreanScoreArray.length; i++) {
//            System.out.println(koreanScoreArray[i]);
//        }

        arrayDemo.scorePrint(koreanScoreArray);
        */

        /*
        System.out.println(">>> 랜덤 카드 게임 <<<");
        String[] shapes = {"spade", "clover", "heart", "diamond"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

        int shapeRandomIndex = (int) (Math.random() * shapes.length);
        int numberRandomIndex = (int) (Math.random() * numbers.length);

        System.out.println("뽑은 카드는 : " + shapes[shapeRandomIndex] + " " + numbers[numberRandomIndex]);
         */

        System.out.println(">>> 주민번호 입력받아서 성별자리 이후부터 * 로 가려서 출력");
        String ssn = "730910-1234567";
        char[] charArray = ssn.toCharArray();
        System.out.println("arr length : " + charArray.length);
        System.out.println("arr gender : " + charArray[7]);

        for (int i = 0; i < charArray.length; i++) {
            if (i > 7) {
                charArray[i] = '*';
            }
        }

        for (char c : charArray) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Result : " + charArray);
    }
}
