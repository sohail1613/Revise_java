//Make a function to check if a number is prime or not.

package com.company.Lecture7;

import java.util.Scanner;

public class Que1 {
    public static void printPrimeNumber(int n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                System.out.println("Not a prime number: "+n);
            } else{
                System.out.println("prime number: "+n);
            }
            return;
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printPrimeNumber(n);
    }
}
