//Find the maximum & minimum number in an array of integers.
//HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java

package com.company.Lecture10;

import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int size= sc.nextInt();

        //defining array
        int numbers[]=new int[size];

        //input
        for (int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        int max= Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        //output
        for (int i=0; i< numbers.length; i++){
            if (numbers[i]<min){
                min=numbers[i];
            }

            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Largest number is :"+max);
        System.out.println("Smallest number is :"+min);
    }

}
