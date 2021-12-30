//Print all even numbers till n.

package com.company;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<= num; i++) {
            if( i % 2 == 0 ) {
                System.out.println("It's Even number: "+i);
            }
        }
    }
}
