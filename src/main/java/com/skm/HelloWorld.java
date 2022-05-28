package com.skm;

public class HelloWorld {
    public static void main(String[] args) {
        String S1 = System.getProperty("user.home");
        String S2 = S1.substring(S1.lastIndexOf("\\") + 1);
        System.out.println("Hello "+S2);
    }
}
