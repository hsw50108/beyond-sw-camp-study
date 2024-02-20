import com.encore.compare.Teacher;

import java.util.Comparator;

public class CompareMain {
    public static void main(String[] args) {
        // 기본 타입은 크기를 비교하여 정렬 가능
        // 객체를 비교할 때는 Comparable(compareTo(T)) vs Comparator(compare(T, T))
        // 해당 비교를 통해서 객체를 정렬 할 수 있음

        // 객체를 비교하기 위해서는 우선 기준을 잡아야 함(객체가 소유하고 있는 변수를 선정)
        // 객체는 Comparable 또는 Comparator 인터페이스를 구현하고 메서드 오버라이딩 해야함

        // 기본 데이터 타입은 연산자를 통해서 쉽게 비교 -> 객체는 어떻게 비교?
        /*
        int x = 1;
        int y = 2;

        if (x > y) {
            System.out.println(-1);
        } else if (x == y) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        */

        //두개의 객체 만들기
        Teacher teacher01 = new Teacher(40, 5);
        Teacher teacher02 = new Teacher(30, 6);

//        int flag = teacher01.compareTo(teacher02);
//        int flag = teacher01.compare(teacher01, teacher02);

        /*if (flag == 1) {
            System.out.println("양수가 리턴");
            System.out.println("오름차순 정렬이라면 자리 변경 필요, 내림차순 정렬이라면 자리 변경이 없음");
        } else if (flag == 0) {
            System.out.println("0이 리턴");
            System.out.println("데이터가 같음");
        } else {
            System.out.println("음수가 리턴");
            System.out.println("오름차순 정렬이라면 자리 변경 필요없음, 내림차순 정렬이라면 자리 변경이 필요");
        }
*/
        // Thread 익명의 클래스, 람다식
        Comparator<Teacher> comp = new Comparator<>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        int flag = comp.compare(teacher01, teacher02);
        if (flag == 1) {
            System.out.println("양수가 리턴");
            System.out.println("오름차순 정렬이라면 자리 변경 필요, 내림차순 정렬이라면 자리 변경이 없음");
        } else if (flag == 0) {
            System.out.println("0이 리턴");
            System.out.println("데이터가 같음");
        } else {
            System.out.println("음수가 리턴");
            System.out.println("오름차순 정렬이라면 자리 변경 필요없음, 내림차순 정렬이라면 자리 변경이 필요");
        }
    }
}
