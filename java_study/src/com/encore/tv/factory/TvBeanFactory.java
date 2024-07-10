package com.encore.tv.factory;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.util.TV;

/*
    Singleton Pattern
    - 인스턴스 생성을 하나로 유지하는 방법
    1. 생성자의 접근지정자를 private
    2. getInstance() 정의해서 자기 자신의 생성된 객체를 반환하는 구현
 */
public class TvBeanFactory {
    private final TV[] ary;
    private static TvBeanFactory instance;

    private TvBeanFactory() {
        ary = new TV[2];
        ary[0] = new SamsungTV();
        ary[1] = new LgTV();
    }

    public static TvBeanFactory getInstance() {
        if (instance == null) {
            instance = new TvBeanFactory();
        }
        return instance;
    }

    public TV getBean(String brandName) {
        return (brandName.equals("samsung")) ? ary[0] : ary[1];
    }




}
