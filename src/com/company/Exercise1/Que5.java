//Write a function that takes in age as input and returns if that person is eligible
//to vote or not. A person of age > 18 is eligible to vote.

package com.company.Exercise1;

import java.util.Scanner;

public class Que5 {
    public static int voteEligibility(int age){
        if (age>18){
            System.out.println("Person have right to vote age is: "+age);
        } else {
            System.out.println("Person does not have right to vote age is: "+age);
        }
        return age;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person age: ");
        int age = sc.nextInt();
        voteEligibility(age);

    }
}
