import java.util.Arrays;

public class InsertSortMain {

    public static void main(String[] args) {

        int[] ary = new int[10];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 100) + 1;
        }
        artPry(ary);
        Arrays.sort(ary);
        int insertIdx = findInsertIdx(ary, 30);
        System.out.println("데이터가 들어갈 베열의 인덱스 : " + insertIdx);
    }

    // 정렬된 배열에서 특정 데이터가 들어갈 번지를 반환
    public static int findInsertIdx(int[] ary, int data) {
        int minIdx = 0;
        for (int i = 1; i < ary.length; i++) {
            if (ary[minIdx] > ary[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    // 정렬 전 배열의 값을 출력
    public static void artPry(int [] ary) {
        System.out.println(">> 정렬전 출력");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "\t");
        }
        System.out.println();

    }
}
