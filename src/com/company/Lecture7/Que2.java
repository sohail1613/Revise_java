//Make a function to check if a given number n is even or not.

package com.company.Lecture7;

import java.util.Scanner;

public class Que2 {
    public static void printEvenNumber(int n){
        if (n==0){
            System.out.println(n+" : Invalid number");
        }
        if (n%2==0){
            System.out.println(n+" :is Even number");
        } else {
            System.out.println(n+" :is odd number");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printEvenNumber(n);
    }
}
