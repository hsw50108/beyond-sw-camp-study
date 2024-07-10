import com.encore.loop.LoopDemo;

public class LoopDemoMain {

    public static void main(String[] args) {
        LoopDemo loopDemo = new LoopDemo();
//        loopDemo.loopMethod01();
//        loopDemo.sumOneToTen();

//        loopDemo.sumStartToEnd(1, 1000);
//        String msg = loopDemo.leapYear(2020);
//        System.out.println(msg);

        // 추출된 윤년을 한 줄에 5개의 년도씩 출력
        loopDemo.leapYearStartToEnd(1900, 2024);
    }
}
