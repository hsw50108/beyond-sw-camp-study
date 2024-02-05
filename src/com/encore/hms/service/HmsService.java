package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDto;
import com.encore.hms.domain.StudentDto;
import com.encore.hms.domain.TeacherDto;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;

// business logic 가지고 있는 클래스
// 1. 배열을 관리
// 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
// 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제
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
        Person person = null;

        switch (type) {
            case STUDENT:
                person = new StudentDto(name, age, address, detail);
                break;
            case TEACHER:
                person = new TeacherDto(name, age, address, detail);
                break;
            case EMPLOYEE:
                person = new EmployeeDto(name, age, address, detail);
                break;
        }
        setPersonArray(person);
        return (index) + "번지에 데이터를 담았습니다.";
    }

//    public String makePerson(int number, String name, int age, String address, String detail) {
//        String msg = "";
//        if (number == 1) {
//            personArray = new StudentDto[]{new StudentDto(name, age, address, detail)};
//            msg  = "학생 객체를 배열에 담았습니다.";
//        } else if (number == 2) {
//            personArray = new TeacherDto[]{new TeacherDto(name, age, address, detail)};
//            msg = "강사 객체를 배열에 담았습니다.";
//        } else {
//            personArray = new EmployeeDto[]{new EmployeeDto(name, age, address, detail)};
//            msg = "직원 객체를 배열에 담았습니다.";
//        }
//        return msg;
//    }

    public void setPersonArray(Person person) {
        personArray[index++] = person;
    }

}
