public class EncoreMain {

    // byte -> short -> int -> long -> float -> double(묵시적 형변환)
    //         char  ->

    // byte <- short <- int <- long <- float <- double(명시적 형변환)
    // 명시적 형변환(캐스팅)
    public static void main(String[] args) {
        System.out.println("섭섭님과 함께하는 즐거운 자바");
        // 지역변수 메서드 내에 선언하는 변수
        // 지역변수 -> 접근제한자 없음(메서드 스코프를 따르기 때문에)
        int intValue = 10;
        char charValue = 'M';

        double doubleValue = 3.14;
        float floatValue = 3.14F;

        String stringValue = "섭섭해";
        boolean booleanValue = false;

        System.out.println("정수값   : " + intValue);
        System.out.println("문자값   : " + charValue);
        System.out.println("실수값   : " + doubleValue);
        System.out.println("문자열값 : " + stringValue);
        System.out.println("논리값   : " + booleanValue);

        /*
            메서드(함수)
            구문형식
            만약 반환타입이 void 가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환

            접근지정자 반환타입 메서드이름([매개변수]){
                문장;
                return (기본값 | 참조값)
            }

         */

    }
}
