//Printed inverted half number pyramid.

package com.company.Lecture6;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number to get pyramid :");
        int number= sc.nextInt();

        //outer loop
        for (int i=1; i<=number; i++){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
