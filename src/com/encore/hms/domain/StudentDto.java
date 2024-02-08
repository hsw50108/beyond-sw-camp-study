package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

import java.io.Serializable;

public class StudentDto extends Person {
    private String stuId;
    public StudentDto(String name, int age, String address, String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }
    @Override
    public String printInfo() {
        return  super.printInfo() + "- 학생 번호 : " + stuId;
    }

    public void changeStudentId(String stuId) {
        this.stuId = stuId;
    }

}
