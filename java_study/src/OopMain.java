import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.TeacherDto;

public class OopMain {
    public static void main(String[] args) {
        System.out.println("========= student ==========");
        StudentDto student01 = new StudentDto("dongwook", 20, "busan", "2020");
        student01.printInfo();
        System.out.println();


        // 접근지정자가 private 일 경우 접근을 허용하지 않는다.
        /*System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 ->" + student01.name);
        System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 ->" + student01.age);
        System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 ->" + student01.address);
        System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 ->" + student01.stuId);*/

        // setter, getter 이용한 접근
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 ->" + student01.getName());
//        student01.setName("dongwook");
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 ->" + student01.getName());

        // 스페셜 생성자 호출을 통한 객체 생성
//        System.out.println();
//        StudentDto student02 = new StudentDto("dongwook", 15, "busan", "2018");
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 -> " + student02.getName());
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 -> " + student02.getAge());
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 -> " + student02.getAddress());
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 -> " + student02.getStuId());

        // 나이 변경
//        student02.setAge(-0);
//        System.out.println("인스턴스 소유의 메서드에 접근하여 값을 가져온다 -> " + student02.getAge());

        // teacherDto
        System.out.println("========= teacher ==========");
        System.out.println("강사 객체");
        TeacherDto teacher01 = new TeacherDto("teacher01", 40, "busan", "English");
        teacher01.printInfo();


//        System.out.println(teacher01.getName());
//        System.out.println(teacher01.getAge());
//        System.out.println(teacher01.getAddress());
//        System.out.println(teacher01.getSubject());

        System.out.println("========= employee ==========");
        EmployeeDto employee01 = new EmployeeDto("employee01", 20, "busan", "HR");
        employee01.printInfo();
//        System.out.println(employee01);
    }
}
