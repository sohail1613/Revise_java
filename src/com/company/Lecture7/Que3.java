//Make a function to print the table of a given number n.

package com.company.Lecture7;

import java.util.Scanner;

public class Que3 {
    public static void printTable(int n){
        for (int i=1; i<11; i++){
            System.out.println(n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }
}
