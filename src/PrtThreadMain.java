import com.encore.thread.Prt;
import com.encore.thread.PrtThread;
/*
멀티쓰레드 환경에서 공유객체를 동시에 사용할 때 발생하는 문제를 해결하기 위해서는
동기화 작업이 필요
Synchronized 키워드 이용
 */
public class PrtThreadMain {
    public static void main(String[] args) {
        System.out.println("PrtThreadMain.main start");

        Prt prt = new Prt();
//        prt.printChar('A');

        PrtThread runnable01 = new PrtThread(prt, 'A');
        Thread thread01 = new Thread(runnable01);
        thread01.start();

        PrtThread runnable02 = new PrtThread(prt, 'B');
        Thread thread02 = new Thread(runnable02);
        thread02.start();

        PrtThread runnable03 = new PrtThread(prt, 'C');
        Thread thread03 = new Thread(runnable03);
        thread03.start();

        System.out.println("PrtThreadMain.main end");
    }
}
