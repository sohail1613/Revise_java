//print solid rhombus pattern

package com.company.Lecture5;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get solid rhombus :");
        int number= sc.nextInt();

        for (int i=1; i<=number; i++){
            //printing space
            for (int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //printing stars
            for (int j=1; j<=number; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
