package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class StudentDto extends Person {
    private String stuId;
    public StudentDto(String name, int age, String address, String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- 학생 번호 : " + stuId);
    }

    public void changeStudentId(String stuId) {
        this.stuId = stuId;
    }

}
