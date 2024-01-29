public class StringDemoMain {
    public static void main(String[] args) {
        // 자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String
        // String 은 인스턴스 생성없이 사용가능하지만 객체로 취급된다.
        String str01 = "dongwook";
        String str02 = "dongwook";

        // 주소값 비교
        if (str01 == str02) {
            System.out.println("값이 동일");
        } else {
            System.out.println("값이 다름");
        }

        // 값비교
        if (str01.equals(str02)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        String str03 = new String("dongwook");
        String str04 = new String("dongwook");
        if (str03 == str04) {
            System.out.println("값이 동일");
        } else {
            System.out.println("값이 다름");
        }

        if (str03.equals(str04)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

    }
}
