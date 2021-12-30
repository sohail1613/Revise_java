package com.zaid;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        int rem = number2%number1;
        int hcf;
        while (rem!=0){
            number2=number1;
            number1=rem;
            rem=number2%number1;
        }
        hcf=number1;
        System.out.println("The HCF of "+number1+" and "+number2+" is: "+hcf);
    }
}
