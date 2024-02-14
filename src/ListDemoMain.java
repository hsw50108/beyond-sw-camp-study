import java.util.*;

/*
List 계열의 자료구조는 순서가 있고, 중복 허용, 객체를 담으면, 동적
 */
public class ListDemoMain {
    public static void main(String[] args) {
        Collection<String> col01 = new ArrayList<>();
        col01.add("A");
        col01.add("B");
//        for (Object o : col01) {
//            System.out.println(o);
//        }

        List<String> col02 = new LinkedList();
        col02.add("B");
        col02.add("B");
        col02.add("B");
        System.out.println(col02.getLast());


        Collection col03 = new HashSet<>();
        col03.add("C");
        col03.add("D");
        col03.add("C");
        col03.add("D");
        col03.add("C");
        col03.add("D");
        col03.add("A");
        col03.add("C");
        col03.add("D");
        col03.add("C");
        col03.add("D");
        col03.add("C");
        col03.add("D");
        col03.add("C");
        col03.add("D");
        col03.add("C");
        System.out.println(col03.size());
        for (Object o : col03) {
            System.out.println(o);
        }
    }
}
