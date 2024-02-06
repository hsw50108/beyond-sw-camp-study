import java.util.Arrays;

public class TwoArray {
    // 2차원 배열은 배열의 배열
    // 선언방법 : int[][] numArray
    public static void main(String[] args) {
        int[][] numArray = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println("length : " + numArray.length);
//        System.out.println("numArray[0] : " + numArray[0].length);
//        System.out.println("numArray[1] : " + numArray[1].length);

        /*for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print(numArray[i][j] + "\t");
            }
        }*/

        // 구구단의 결과를 2차원 배열에 담는다면?
        // 출력예시)
        // 2단 2 4 ... 18
        // 3단 3 6 ... 27

        int[][] gugudanArray = new int[8][9];

        for (int i = 2; i <= 9; i++) {
//            System.out.print(i + "단");
            for (int j = 1; j <= 9; j++) {
//                System.out.print((i * j) + "\t");
                gugudanArray[i - 2][j - 1] = (i * j);
            }
//            System.out.println();
        }

//        for (int i = 0; i < gugudanArray.length; i++) {
//            System.out.print(i + 2 + "단 ");
//            for (int j = 0; j < gugudanArray[i].length; j++) {
//                System.out.print(gugudanArray[i][j] + "\t");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < gugudanArray.length; i++) {
            System.out.print(i + 2 + " 단 : ");
            System.out.print(Arrays.toString(gugudanArray[i]));
            System.out.println();
        }


    }
}
