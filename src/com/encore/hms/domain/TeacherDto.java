package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class TeacherDto extends Person {
    private String subject;
    public TeacherDto(String name, int age, String address, String subject) {
        super(name, age, address);
        this.subject = subject;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- 과목 : " + subject);
    }

    public void changeSubject(String subject) {
        this.subject = subject;
    }
}
