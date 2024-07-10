package com.encore.thread;

public class PrtThread implements Runnable {

    private final Prt monitor;
    private final char charValue;

    public PrtThread(Prt monitor, char charValue) {
        this.monitor = monitor;
        this.charValue = charValue;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            for (int i = 0; i < 10; i++) {
                monitor.printChar(charValue);
            }
        }
    }

}
