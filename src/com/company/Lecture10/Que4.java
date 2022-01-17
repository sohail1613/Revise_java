//Taking an array as an input and printing its elements.

package com.company.Lecture10;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int number[]= new int[size];

        for (int i=0; i<size; i++){
            number[i]= sc.nextInt();
        }

        //print array
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}
