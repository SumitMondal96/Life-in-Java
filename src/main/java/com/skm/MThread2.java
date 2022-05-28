package com.skm;

public class MThread2 {
    public static void main(String[] args) {
        MThread1 M1 = new MThread1();
        Thread T1 = new Thread(M1);
        Thread T2 = new Thread(M1);
        T1.start();
        T2.start();
    }
}
