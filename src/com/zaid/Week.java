package com.zaid;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1:
                //System.out.println("Weekdays");
                //break;
            case 2 :
                //System.out.println("Weekdays");
                //break;
            case 3 :
                //System.out.println("Weekdays");
                //break;
            case 4:
                //System.out.println("Weekdays");
                //break;
            case 5 :
                System.out.println("Weekdays");
                break;
            case 6 :
                //System.out.println("Weekend");
                //break;
            case 7 :
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("hello");
    }
}
