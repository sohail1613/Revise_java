//Enter 3 numbers from the user & make a function to print their average.

package com.company.Exercise1;

import java.util.Scanner;

public class Que1 {
    int average;
    public static void printAverage(int number1, int number2, int number3){
        int average=(number1+number2+number3)/3;
        System.out.println(average);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values: ");
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3=sc.nextInt();

        printAverage(number1,number2,number3);
    }
}
