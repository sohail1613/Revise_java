package com.company.Exercise1;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        int positive=0, negative=0, total=0;
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.print("Enter numbers: ");
            int number= sc.nextInt();

            if (number==0)
                break;
            else if (number>0){
                positive=positive+number;
            } else {
                negative=negative+number;
            }
            total=positive+negative;
        }
        System.out.println("Total sum of positive numbers is: "+positive);
        System.out.println("Total sum of negative numbers is: "+negative);
        System.out.println("Total sum is : "+total);
    }
}
