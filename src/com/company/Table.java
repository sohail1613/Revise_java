//Print table , input from user

package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Table of "+n+" is");
        for (int i = 1; i<=10; i++) {
            System.out.println(i*n);
        }
    }
}
