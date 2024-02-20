import com.encore.generics.*;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        /*
        제네릭스 사용시 코드상의 이점?
        - 컴파일 타입시 타입의 안정성 유지
        - 불필요한 다운캐스팅을 지양
         */

//        List<String> lst = new ArrayList<>();
//        ClassName<String, Integer> obj = new ClassName<>();
//        ClassName<Student> obj = new ClassName<>();
//        ClassName<String> obj1 = new ClassName<>();
//        ClassName<Integer> obj2 = new ClassName<>();
//
//        obj1.setElement("10");
//        System.out.println("value : " + obj1.getElement());
//        System.out.println("변수 타입 : " + obj1.getElement().getClass().getName());
//
//        obj2.setElement(10);
//        System.out.println("value : " + obj2.getElement());
//        System.out.println("변수 타입 : " + obj2.getElement().getClass().getName());

        //<K, V>
//        ClassName<String, Integer> obj = new ClassName<>();
//        obj.setX("10", 10);
//        System.out.println("value : " + obj.getKey());
//        System.out.println("변수 타입 : " + obj.getKey().getClass().getName());

        // 제네릭스의 다형성
        // 와일드카드(?)를 사용
        // <? extends Skating> : skating을 상속받는 모든 하위 객체를 포람
//        List<? extends Skating> list = new ArrayList();

        List<? super Golf> list = new ArrayList();

        list.add(new Golf());
//        list.add(new Skating());
//        list.add(new SpeedSkating());
//        list.add(new ShortTrackSkating());
    }
}