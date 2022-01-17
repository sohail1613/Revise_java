//Take an array of names as input from the user and print them on the screen.

package com.company.Lecture10;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int size= sc.nextInt();
        //array defining
        String names[]=new String[size];

        //input from user
        for (int i=0; i<size; i++){
            names[i]= sc.nextLine();
        }

        //output
        for (int i=0; i< names.length; i++){
            System.out.println("Name "+(i)+" is : "+names[i]);
        }
    }
}
