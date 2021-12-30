package com.company.Lecture3;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum is: "+(num1+num2));
        System.out.println("Diff is: "+(num1-num2));
        System.out.println("Mul is: "+(num1*num2));
        System.out.println("Div is: "+(num1/num2));
        System.out.println("Modulo is: "+(num1%num2));
    }
}
