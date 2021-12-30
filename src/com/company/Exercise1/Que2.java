//Write a function to print the sum of all odd numbers from 1 to n.

package com.company.Exercise1;

import java.util.Scanner;

public class Que2 {
    public static void printOddSum(int number){
        int sum=0;
        for (int i=1; i<=number;i=i+2){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to n: ");
        int number= sc.nextInt();
        printOddSum(number);
    }
}

