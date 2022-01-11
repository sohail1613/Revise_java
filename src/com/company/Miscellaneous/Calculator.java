//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//        1 : + (Addition) a + b
//        2 : - (Subtraction) a - b
//        3 : * (Multiplication) a * b
//        4 : / (Division) a / b
//        5 : % (Modulo or remainder) a % b
//        Calculate the result according to the operation given and display it to the user.

package com.company.Miscellaneous;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff =  num1 - num2;
        int multiple = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("total sum = "+sum);
        System.out.println("Subtraction is = "+diff);
        System.out.println("Multiple is = "+multiple);
        System.out.println("Division is ="+division);
        System.out.println("Modulo is = "+modulo);
    }
}
