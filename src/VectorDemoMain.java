import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
싱글 쓰레드 : 순차실행
  |  main start - 파일 다운로드(A) - 파일 다운로드(B) - 파일 다운로드(C) - main end
멀티 쓰레드 : 병렬실행
  |  main start - 파일 다운로드(A)(thread) - 파일 다운로드(B)(thread) - 파일 다운로드(C)(thread) - main end

 ArrayList - Vector
 vector : 강제동기화로 인해서 성능에 문제가 생긴다.
 */
public class VectorDemoMain {
    public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
//        List<Integer> vec = new Vector<>();

        /*new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(1); // not synchronized
                vec.add(1); // synchronized
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(1); // not synchronized
                vec.add(1); // synchronized
            }
        }).start();


        // 출력을 위한 쓰레드
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("ArrayList size = " + list.size());
                System.out.println("Vector size = " + vec.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
*/
        List<Integer> vec = new Vector<>();
        // 두 개의 쓰레드가 동일한 vector 접근하는 코드
        // 인스턴스 자체는 동기화가 되어있지 않음
        new Thread(() -> {
            vec.add(1);
            vec.add(2);
            vec.add(3);
            System.out.println(vec.get(0));
            System.out.println(vec.get(1));
            System.out.println(vec.get(2));
        }).start();

        new Thread(() -> {
            vec.removeFirst();
            vec.removeFirst();
            vec.removeFirst();
        });

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Vector size = " + vec.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
