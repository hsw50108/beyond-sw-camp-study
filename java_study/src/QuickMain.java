public class QuickMain {

    public static void main(String[] args) {
        int[] ary = new int[10];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 100) + 1;
            for (int j = 0; j < i; j++) {
                if (ary[j] == ary[i]) {
                    i--;
                    break;
                }
            }
        }
        quickPrt(ary);
        quickSort(ary, 0, ary.length - 1);
    }

    public static void quickSort(int[] ary, int low, int high) {
        if (low > high) {
            return;
        }

        int pivot = low;
        int left = low + 1;
        int right = high;

        while (left <= right) {
            while (left <= right && ary[left] <= ary[pivot]) {
                left++;
            }

            while (right > low && ary[left] <= ary[pivot]) {
                right--;
            }

            if (low <= high) {
                int temp = 0;
            }

        }
    }
    public static void quickPrt(int[] ary){
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "\t");
        }
        System.out.println();
    }
}
