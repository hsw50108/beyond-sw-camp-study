package com.encore.hms.view;

import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.TeacherDto;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

import java.util.Scanner;

public class HmsView {
    public static Scanner sc = new Scanner(System.in);
    private final HmsService hmsService;

    public HmsView() {
        hmsService = new HmsService(10);
    }

    public void mainMenu() {
        while (true) {
            System.out.println(">>>> HMS ver1.0 <<<<");
            System.out.println("1. 전체 출력");
            System.out.println("2. 이름으로 검색");
            System.out.println("3. 이름으로 찾아서 수정");
            System.out.println("4. 이름으로 찾아서 삭제");
            System.out.println("5. 생성");
            System.out.println("99. 종료");
            System.out.print("Input Number : ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    perPrint();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    subMenu();
                    break;
                case 99:
                    System.out.println("프로그램을 종료 후 데이터는 보관되지 않습니다.");
                    System.exit(0);
            }
        }
    }

    /*
        Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
        존재할 경우 해당 객체의 정보를 출력하고
        존재하지 않을 경우 '정보가 존재하지 않습니다.' 라는 메시지를 출력
        HmsView - HmsService(searchPerson(String name))
     */
    public void search() {
        System.out.print("찾으시는 이름을 입해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        Person person = hmsService.findByName(inputName);
        if (person == null) {
            System.out.println("정보가 존재하지 않습니다.");
        } else {
            person.printInfo();
        }
    }

    /*
        Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
        존재할 경우 해당 객체의 각 detail 정보 수정
        '정보를 수정하였습니다.' 라는 메시지를 출력
        HmsView - HmsService(updatePerson(String name, String detail))
     */
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾으시는 이름을 입력해주세요 : ");
        String findName = scanner.nextLine();

        Person obj = hmsService.updatePerson(findName);
        if (obj != null) {
            if (obj instanceof StudentDto student) {
                System.out.println("학번 수정");
                String stuId = scanner.nextLine();
                student.changeStudentId(stuId);
            }
            if (obj instanceof TeacherDto teacher) {
                System.out.println("과목 수정");
                String subject = scanner.nextLine();
                teacher.changeSubject(subject);
            }
            if (obj instanceof EmployeeDto employee) {
                System.out.println("부서 수정");
                String dept = scanner.nextLine();
                employee.changeDept(dept);
            }
        } else {
            System.out.println("정보가 존재하지 않습니다.");
        }


//        System.out.print("원하시는 상세 정보 변경을 입력해주세요 : ");
//        String inputChangeDetail = scanner.nextLine();
//        hmsService.updatePerson(findName,inputChangeDetail);
    }

    /*
        Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
        존재할 경우 해당 객체를 배열에서 삭제하고
        전체출력을 했을 때 정상적으로 출력되면 OK
        HmsView - HmsService(removePerson(String name))
     */
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾으시는 이름을 입력해주세요 : ");
        String findName = scanner.nextLine();


        hmsService.remove(findName);
    }

    public void perPrint() {
        System.out.println();
        System.out.println(">> 전체 출력 <<");
        Person[] personArray = hmsService.getPersonArray();

        if (hmsService.getIndex() == 0) {
            System.out.println();
            System.out.println(">> 데이터가 존재하지 않습니다");
        } else {
            for(int idx = 0 ;  idx < personArray.length ; idx++) {
                Person per = personArray[idx] ;
                if(per == null) {
                    break;
                }
                per.printInfo();
            }
        }
    }

    public void subMenu() {
        while (true) {
            System.out.println();
            System.out.println(">>>> 객체 생성을 위한 Sub Menu <<<<");
            System.out.println("1. 학생");
            System.out.println("2. 강사");
            System.out.println("3. 직원");
            System.out.println("99. 상위 메뉴 이동");
            System.out.print("Input Number : ");
            int number = sc.nextInt();
            switch (number) {
                case 1, 2, 3:
                    makePerson(number);
                    break;
                case 99:
                    return;
            }
        }
    }

    public void makePerson(int number) {
        System.out.println();
        System.out.println(">> 객체 생성 <<");
        Scanner scanner = new Scanner(System.in);
        if (number == 1) {
            Result result = getResult(scanner);
            System.out.print("학번을 입력해주세요 : ");
            String detail = scanner.nextLine();
            System.out.println(hmsService.makePerson(HmsType.STUDENT, result.name(), result.age(), result.address(), detail));

        } else if (number == 2) {
            Result result = getResult(scanner);
            System.out.print("과목을 입력해주세요 : ");
            String detail = scanner.nextLine();
            System.out.println(hmsService.makePerson(HmsType.TEACHER, result.name(), result.age(), result.address(), detail));

        } else if (number == 3) {
            Result result = getResult(scanner);
            System.out.print("부서를 입력해주세요 : ");
            String detail = scanner.nextLine();
            System.out.println(hmsService.makePerson(HmsType.TEACHER, result.name(), result.age(), result.address(), detail));

        }
    }

    private static Result getResult(Scanner scanner) {
        System.out.print("이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소를 입력해주세요 : ");
        String address = scanner.nextLine();

        return new Result(name, age, address);
    }
    private record Result(String name, int age, String address) {}
}
