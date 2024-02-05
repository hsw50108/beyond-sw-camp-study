import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

// 1. student 2. teacher 3. employee
public class HmsMain {
    public static void main(String[] args) {
        HmsService hmsService = new HmsService(10);
        String msg = hmsService.makePerson(HmsType.STUDENT, "dongwook", 20, "seoul", "1992");
        System.out.println(msg);
        // 출력 예시 학생(직원, 강사) 객체를 배열에 담았습니다.

        msg = hmsService.makePerson(HmsType.TEACHER, "dongwook", 20, "seoul", "자바");
        System.out.println(msg);

        msg = hmsService.makePerson(HmsType.EMPLOYEE, "dongwook", 20, "seoul", "hr");
        System.out.println(msg);
    }
}
