package com.company.Lecture5;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :");
        int number= sc.nextInt();

        for (int i=1; i<=number; i++) {
            //printing space
            for (int j=1; j<=number-i; j++) {
                System.out.print(" ");
            }

            //printing numbers
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
