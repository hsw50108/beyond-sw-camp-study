package com.encore.hms.domain.sup;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class Person implements Serializable {
    private final String name;
    private final int age;
    private final String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String printInfo() {
        return "이름 : " + name + " 나이 : " + age + " 주소 : " + address;
    }

}
