//Make a program that prints the table of a number that is input by the user.

package com.company.Lecture2;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(i*num);
    }


    }
}
