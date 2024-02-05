package com.encore.hms.domain.sup;

import lombok.Getter;

@Getter
public class Person {
    private final String name;
    private final int age;
    private final String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + address);
    }

}
