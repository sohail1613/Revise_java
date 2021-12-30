//Write a function that takes in the radius as input and returns the
//circumference and area of a circle.

package com.company.Exercise1;

import java.util.Scanner;

public class Que4 {
    public static void circleCircumference(int radius){
        double area= 3.14*(radius*radius);
        double circumference=2*3.14*radius;
        System.out.println("Area if the circle is: "+area);
        System.out.println("Circumference of the circle is: "+circumference);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle to get it's circumference and area: ");
        int radius=sc.nextInt();
        circleCircumference(radius);

    }
}
