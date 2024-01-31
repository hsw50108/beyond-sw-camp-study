import com.encore.staticdemo.StaticDemo;
public class StaticMain {

    public static void main(String[] args) {
        StaticDemo staticDemo01 = new StaticDemo("dongwook");
        staticDemo01.staticMessage = "static message";
        System.out.println(StaticDemo.staticMessage);
        System.out.println(staticDemo01.getName());
        staticDemo01.nonStatic();

        // staticMethod() 인스턴스 소유가 아닌 클래스 소유이므로 클래스 이름으로 접근 가능
        StaticDemo.staticMethod();

        System.out.println("------------------------");

        StaticDemo staticDemo02 = new StaticDemo("encore");
        System.out.println(staticDemo02.getName());
        staticDemo02.staticMessage = "static message2";
        System.out.println(StaticDemo.staticMessage);

        System.out.println(StaticDemo.staticMessage2);

    }
}
