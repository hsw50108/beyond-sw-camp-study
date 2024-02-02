import java.util.Random;

public class AryMain {
    public static void main(String[] args) {
        // 참조 타입 배열 선언 -> 객체 생성 필요(new)
        // 선언과 동시에 객체 생성 완료 !
        int[] ary = new int[10];

        // field 임 not method
        System.out.println("배열의 길이 - " + ary.length);

        Random random = new Random();
        for (int i = 0; i < ary.length; i++) {
            ary[i] = random.nextInt(100) + 1;
            System.out.print(ary[i] + ", ");
        }

        // enhanced for
        for (int i : ary) {
            System.out.print(i + "\t");
        }
    }

}

