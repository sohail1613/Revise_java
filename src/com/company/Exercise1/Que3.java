//Write a function which takes in 2 numbers and returns the greater of those
//two.
package com.company.Exercise1;

import java.util.Scanner;

public class Que3 {
    public static void greatestNumber(int number1, int number2){

        if (number1>number2){
            System.out.println("First number is greater: "+number1);
        } else {
            System.out.println("Second number is greater: "+number2);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First number: ");
        int number1= sc.nextInt();
        System.out.println("Enter second number: ");
        int number2= sc.nextInt();
        greatestNumber(number1, number2);
    }
}
