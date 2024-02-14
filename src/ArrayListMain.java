import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.TeacherDto;
import com.encore.hms.domain.sup.Person;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        Number[] numbers = new Number[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("length : " + numbers.length);

        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        System.out.println("length : " + list.size());
        list.remove(2);
//        System.out.println("length : " + list.size());

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
//        System.out.println("length : " + list1.size());

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list1.addAll(list2);
        System.out.println(list1);
        list1.add(3, "F");
        System.out.println(list1);

        // 요소 검색
        list1.contains("F");

        // 요소의 부분 추출
        List<String> strings = list1.subList(0, 4);
        System.out.println(strings);

        // 보안상의 이유로 딥카피
//        List<String> copyList = (List<String>)((ArrayList<String>)list.clone());

        // 자료구조를 배열로 반환해야한다면?
//        String[] ary = (String[] copyList)

        // 요소 변경
        System.out.println(list);
        list.set(3, 10);
        System.out.println(list);

        // 사이즈를 동적으로 늘리는 작업이 가능
        ((ArrayList<String>) list2).ensureCapacity(100);

        // 정렬
        System.out.println("--정렬--");
        List<Integer> sortList = new ArrayList<>();
        sortList.add(3);
        sortList.add(2);
        sortList.add(1);
        System.out.println(sortList);

        System.out.println("descending - " + sortList);
        sortList.sort(Comparator.naturalOrder());

        System.out.println("ascending - " + sortList);
        sortList.sort(Comparator.reverseOrder());

        // 순회
        List<Person> hmsList = new ArrayList<>();
        hmsList.add(new StudentDto("dongwook1", 20, "seoul", "2023"));
        hmsList.add(new TeacherDto("dongwook2", 40, "seoul", "Math"));
        hmsList.add(new EmployeeDto("dongwook3", 30, "seoul", "HR"));

        Iterator<Person> iterator = hmsList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().printInfo());
        }

        for (Person person : hmsList) {
            System.out.println(person.printInfo());
        }

//        for (int i = 0; i < hmsList.size(); i++) {
//            Person person = hmsList.get(i);
//            System.out.println(person.printInfo());
//        }


        // 삭제
//        list1.add(10, "D");  // 에러
        list1.remove(0);
    }

}
