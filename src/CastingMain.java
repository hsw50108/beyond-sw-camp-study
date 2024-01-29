public class CastingMain {
    public static void main(String[] args) {
        // 자바의 캐스팅 연산자 : (타입) 변수명;
        byte x, y, sum; // 선언
        x = 10;
        y = 10;
        sum = (byte) (x + y);
        System.out.println("sum = " + sum);

        char charValue = 'A';
        char charValue2 = 'B';
        System.out.println("char value = " + charValue);
        System.out.println( charValue + charValue2); // 131
        System.out.println("--");
        System.out.println( charValue + charValue2); // ??
        System.out.println((char) 97); // 131


    }


}
