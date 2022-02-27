package com.company;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        int number[] = {4, 15, 2, 7, 20};
        //System.out.println(max(number));

        int original = 5674;
        System.out.println(reverse(original));

    }

    public static  int max(int number[]){
        int max = number[0];
        int i=1;
        while (i<number.length){
            if (number[i]>max){
                max=number[i];
            } else {
                i++;
            }
        }
        return max;
    }
    public  static int reverse(int number){
        int sum=0, remainder;
        while(number!=0){
            remainder = number%10;
            sum = (sum*10) + remainder;
            number= number/10;
        }
        return sum;
    }
}
