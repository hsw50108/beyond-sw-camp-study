import com.encore.thread.ShareObj;
public class ThreadDemoMain {
    public static void main(String[] args) {
        System.out.println("ThreadDemoMain.main start !!");
        Runnable shareObj = new ShareObj();

        Thread thread01 = new Thread(shareObj);
        thread01.start();

//        shareObj.run();
//        shareObj.run();

        System.out.println("ThreadDemoMain.main end !!");
    }
}
