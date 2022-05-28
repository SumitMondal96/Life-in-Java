package com.skm;

public class MThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }
}
