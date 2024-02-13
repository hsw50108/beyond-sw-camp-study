package com.encore.thread;

// 자바에서 쓰레드의 대상이 되는 객체를 정의하고 싶다면?
// extends Thread
// implement Runnable
public class ShareObj implements Runnable{
    public ShareObj() {}

    // 쓰레드의 구현부
    // 코드상에서 개발자가 직접적으로 호출할 수 없다.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }

}
