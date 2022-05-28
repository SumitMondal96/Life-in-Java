package com.skm;

import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        System.out.println("Please input the word: ");
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        StringBuilder S2 = new StringBuilder(S1);
        System.out.println(S2.reverse());
    }
}
