package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.TeacherDto;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;
import lombok.Getter;

// business logic 가지고 있는 클래스
// 1. 배열을 관리
// 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
// 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제
@Getter
public class HmsService {

    private Person[] personArray;
    private int index;

    public HmsService() {
    }

    public HmsService(int size) {
        personArray = new Person[size];
    }

    public String makePerson(HmsType type, String name, int age, String address, String detail) {
        String msg = null;
        Person person = switch (type) {
            case STUDENT -> new StudentDto(name, age, address, detail);
            case TEACHER -> new TeacherDto(name, age, address, detail);
            case EMPLOYEE -> new EmployeeDto(name, age, address, detail);
        };

        setPersonArray(person);
        return (index) + "번지에 데이터를 담았습니다.";
    }

    public void setPersonArray(Person person) {
        personArray[index++] = person;
    }

    public Person findByName(String inputName) {
        Person person = null;
        for (int i = 0; i < personArray.length; i++) {
            person = personArray[i];
            if (person != null) {
                if (person.getName().equals(inputName)) {
                    return person;
                }
            }
        }
        return null;
    }

    public void updatePerson(String findName, String inputChangeDetail) {
        Person person = findByName(findName);
        if (person instanceof StudentDto student) {
            student.changeStudentId(inputChangeDetail);
        } else if (person instanceof EmployeeDto employee) {
            employee.changeDept(inputChangeDetail);
        } else if (person instanceof TeacherDto teacher) {
            teacher.changeSubject(inputChangeDetail);
        }
    }

    public void remove(String findName) {
        int count = personArray.length;
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if (findName.equals(personArray[i].getName())) {
                for (int j = 0; j < count - 1; j++) {
                    personArray[j] = personArray[j + 1];
                }
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("삭제 후 정보");
            for (int i = 0; i < personArray.length; i++) {
                Person person = personArray[i];
                person.printInfo();
            }
        }
    }

}
