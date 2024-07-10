import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.sup.Person;

public class RefAryMain {
    public static void main(String[] args) {
        /*
         * 배열이란? (Collection)
         * - 객체로 취급[], 0 ~ , length, 고정길이, sameType
         * - 배열에 담을 수 있는 요소의 타입(기본, 참조)
         *
         * int[] ary; -- 선언
         * int ary[10]; -- error 배열 선언시 길이 고정 x
         * ary = new int[10] -- 배열 생성(10방을 가지는)
         * String [] ary = {};
         * String[] ary = new String[10] {} -- error
         *
         */

        //Q.학생 객체 30명을 만들어서 관리
        // StudentDto stu01, stu02, stu03,... stu30,;
        int idx = 0;
        StudentDto[] students = new StudentDto[30];
        students[idx++] = new StudentDto("dongwook", 20, "basan", "2020");
        // 타입 미스매치
//        students[idx++] = new EmployeeDto("dongwook2", 20, "basan", "2020");

        // 만약, 학생, 강사, 직원 객체를 담는 배열을 사용하고자 한다면?
        // 3개의 배열을 만들어야 한다.
        // 변수의 다형성이 적용된다면 - 1개

        Person student = new StudentDto("student1", 20, "busan", "2020");
        Person employee = new EmployeeDto("employee1", 230, "seoul", "hr");
        Person teacher = new EmployeeDto("teacher1", 30, "seoul", "1033");

        int perIndex = 0;
        Person[] perArray = new Person[3];
        perArray[perIndex++] = new StudentDto("student1", 20, "busan", "2020");
        perArray[perIndex++] = new EmployeeDto("employee1", 230, "seoul", "hr");
        perArray[perIndex++] = new EmployeeDto("teacher1", 30, "seoul", "1033");

        System.out.println("ary person perIndex = " + perIndex);
        for (int i = 0; i < perArray.length; i++) {
            Person per = perArray[i];
//            if (per instanceof StudentDto) {
//                StudentDto obj = (StudentDto) per;
//                obj.printInfo();
//            }
//
//            if (per instanceof TeacherDto) {
//                TeacherDto obj = (TeacherDto) per;
//                obj.printInfo();
//            }
//
//            if (per instanceof EmployeeDto) {
//                EmployeeDto obj = (EmployeeDto) per;
//                obj.printInfo();
//            }
            per.printInfo();
            System.out.println();
        }

    }
}
