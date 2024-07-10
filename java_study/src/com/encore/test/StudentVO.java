package com.encore.test;

/*
 *  xxxxxVO.java, xxxxxDto.java, xxxxxEntity.java
 *  -- 업무 로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter, Getter
 *
 * */
public class StudentVO {
    /*
        생성자
        매개변수가 없는 생성자는 기본 생성자
        매개변수가 있는 생성자는 스페셜 생성자
        명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
        구문형식)

        접근지정자 클래스이름 ([매개변수]){
        }

        메서드(함수)
        만약 반환타입이 void 가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환
        구문형식)

        접근지정자 반환타입 메서드이름([매개변수]){
             문장;
             return (기본값 | 참조값)
          }

        변수(variable)
        구문형식 : 접근지정자 변수타입 변수명;
        -- 접근지정자(public, private)
        -- 변수타입(기본타입, 참조타입)
        -- 변수명 (소문자로 시작)

        변수란 선언 위치 존재(전역, 지역)
     */

    // 전역 변수(클래스내에서 접근가능한 범위를 갖는 것)
    private String name;
    private int age;
    private double height;
    private boolean isMarriage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarriage() {
        return isMarriage;
    }

    public void setMarriage(boolean marriage) {
        isMarriage = marriage;
    }
}
