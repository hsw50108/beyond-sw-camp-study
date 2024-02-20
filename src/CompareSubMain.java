import com.encore.compare.EncoreInteger;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
정렬 : 모든 프로그램은 오름차순으로 정렬
JAVA : 기준을 정의하지 않으면 오름차순
기본타입과, 배열이 기본 타입을 요소로 가지고 있다면
Arrays.sort(), Collections.sort()

[정렬의 일반화된 규칙]
- 비교 결과 리턴 될 때
- 음수 : 두 원소의 위치를 교환하지 않음.
- 양수 : 두 원소의 위치를 교환
 */
public class CompareSubMain {
    public static void main(String[] args) {
        EncoreInteger[] ary = new EncoreInteger[10];

        // 랜덤하게 배열 초기화(1 ~ 100) : Random - randomInt(), Math - random
        for (int i = 0; i < ary.length; i++) {
            ary[i] = new EncoreInteger((int) (Math.random() * 100) + 1);
        }

        System.out.println("정렬 전");
        for (EncoreInteger encoreInteger : ary) {
            System.out.print(encoreInteger.getData() + "\t");
        }
        System.out.println();

        System.out.println("정렬 후");
//        Comparator<EncoreInteger> comparator = Comparator.comparingInt(EncoreInteger::getData);
        Comparator<EncoreInteger> comparator = new Comparator<EncoreInteger>() {
            @Override
            public int compare(EncoreInteger o1, EncoreInteger o2) {
                return o1.getData() - o2.getData();
            }
        };

        Arrays.sort(ary, comparator); // 오름
//        Arrays.sort(ary, Collections.reverseOrder(comparator)); // 내림

        for (EncoreInteger encoreInteger : ary) {
            System.out.print(encoreInteger.getData() + "\t");
        }

    }



}
