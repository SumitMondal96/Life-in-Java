package com.skm;

import java.util.Scanner;

public abstract class Barclays implements Finance{
    public static void main(String[] args) {
        System.out.println("Enter Principal Amount:");
        Scanner input = new Scanner(System.in);
        double Principal = input.nextDouble();

        //Using Lambda Expression

        Finance F1 = () -> r*t;
        System.out.println("Simple Interest: "+(Principal*F1.calculateSI()));
        System.out.println("Total Amount: "+(Principal+(Principal*F1.calculateSI())));
    }
}
