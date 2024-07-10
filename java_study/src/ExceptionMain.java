public class ExceptionMain {
    public static void main(String[] args) {


/*
        String[] strAry = {"SW", "Java", "Python"};
        try {
            System.out.println("예외 발생 코드 시작");
            for (int i = 0; i <= strAry.length; i++) {
                System.out.println(strAry[i]);
            }
            System.out.println("예외 발생 코드 종료");
        } catch (Exception e) {
            System.out.println("예외 발생시 호출되는 영역");
        } finally {
            System.out.println("예외발생 여부와 상관없이 항상 수행");
        }
        System.out.println(">>> main finish");
*/

    }

    public static int userException() throws ArithmeticException {
        int result = 10 / 0;
        return result;
    }
}
