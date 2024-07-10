import com.encore.lambda.ILambda;
import com.encore.lambda.LambdaImpl;

public class LambdaMain {
    public static void main(String[] args) {

        ILambda lambda = new ILambda() {
            @Override
            public void printInfo(String str) {
                System.out.println(str);
            }

            @Override
            public int add(int x, int y) {
                return x + y;
            }
        } ;
        lambda.printInfo("hello~~");
        System.out.println("add = " + lambda.add(10,10));

//        ILambda lambda = (int x, int y ) -> {
//            return x + y ;
//        } ;

        System.out.println("add = " + lambda.add(10, 10));

        ILambda lambda2 = new LambdaImpl();
        lambda2.printInfo("기존 코드 방식");
        System.out.println("add = " + lambda2.add(10, 10));

//        int addSum = result((x, y) -> x + y);
//        System.out.println("add = " + addSum);
    }

    public static int result(ILambda lambda) {
        return lambda.add(10, 10);
    }
}
