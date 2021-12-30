package com.company.Lecture4;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num==1 || num== 10 ) {
            System.out.println(num+" it is prime number.");
        } else {
            System.out.println("Not prime.");
        }

    }
}
