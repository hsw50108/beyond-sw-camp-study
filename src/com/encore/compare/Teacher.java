package com.encore.compare;

// comparable 특징
// 자기 자신과 매개변수를 비교하는 것
// 구현메서드는 compareTo()

// comparator 특징
// - 인자로 전달되는 두 객체의 기준값을 가지고 비교하는 것
// - 구현 메서드는 compare()

import java.util.Comparator;

//public class Teacher implements Comparable<Teacher> {
public class Teacher implements Comparator<Teacher> {
    private int age;
    private int classNumber;

    public Teacher() {
    }
    public Teacher(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", classNumber=" + classNumber +
                '}';
    }

    // 구현 1 compareTo
    /*@Override
    public int compareTo(Teacher o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }*/

    // 구현2  compare
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age == o2.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
