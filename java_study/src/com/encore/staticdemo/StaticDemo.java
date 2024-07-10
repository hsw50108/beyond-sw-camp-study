package com.encore.staticdemo;

import lombok.*;

import javax.swing.plaf.PanelUI;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaticDemo {
    // 전역(인스턴스, 클래스)
    // 인스턴스 소유
    private String name;

    // 클래스 소유
    public static String staticMessage;

    public static final String staticMessage2 = "final static message";

    public void nonStatic() {
        System.out.println("나는 인스턴스 소유의 메서드 입니다.");
        staticMessage = "from non static";  // 가능
        name = "encore";                    // 가능
        staticMethod();                     // 가능
    }

    public static void staticMethod() {
        System.out.println("나는 클래스 소유의 메서드 입니다.");
//        nonStatic();     //불가능
//        name = "encore"; //불가능
    }

}
