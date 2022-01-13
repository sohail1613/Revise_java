package com.company.Lecture5;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get pattern :");
        int number= sc.nextInt();

        for (int i=number; i>=1; i--){
            for (int j=1 ;j<i; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=number-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
