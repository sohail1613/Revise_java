//Digits sum of an integer using function

package com.company.Lecture11;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println("The sum of the number is: "+digitsSum(digit));
    }

    public static int digitsSum(int number){
        int sum=0;
        while (number!=0){
            sum = sum+number%10;
            number = number/10;
        }
        return sum;
    }
}
