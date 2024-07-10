public class SelectSortMain {

    // step01. 10개의 방을 가지는 배열 만들고 랜덤하게(1~100) 값으로 초기화 후 정렬전 출력

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        aryPrt(array);
        // step02. 초기화된 배열로부터 최소값이 들어 있는 인덱스 리턴받아 출력
        int minIdx = findMinIdx(array);
        System.out.println("최소값을 가지는 배열의 인덱스 : " + minIdx);
        System.out.println("최소값 : " + array[minIdx]);
    }

    private static int findMinIdx(int[] array) {
        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIdx] > array[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    // 정렬 전 배열의 값을 출력
    public static void aryPrt(int[] ary) {
        System.out.println("정렬 전 출력");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "\t");
        }
        System.out.println();
    }
}
