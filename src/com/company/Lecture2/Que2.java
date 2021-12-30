//Make a program that takes the radius of a circle as input,
// calculates its radius and area and prints it as output to the user.
package com.company.Lecture2;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        double area = 3.14*(radius*radius);

        System.out.println("The radius of circle is: "+radius);
        System.out.println("Area of circle is: "+area);
    }
}
