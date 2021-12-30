package com.company.Lecture4;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=2; i<=num; i=i+2) {
            System.out.println(i);
        }
    }
}
