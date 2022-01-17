//Print inverted half pyramid.

package com.company.Lecture6;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get pyramid :");
        int number= sc.nextInt();

        //outer loop
        for (int i=1; i<=number; i++){
            //inner loop
            for (int j=i; j<=number; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
