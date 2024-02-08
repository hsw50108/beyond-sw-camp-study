package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

import java.io.Serializable;

public class EmployeeDto extends Person  {
    private String dept;
    public EmployeeDto(String name, int age, String address, String dept) {
        super(name, age, address);
        this.dept = dept;
    }
    @Override
    public String printInfo() {

        return  super.printInfo() + "- 부서 : " + dept;
    }

    public void changeDept(String dept) {
        this.dept = dept;
    }
}
