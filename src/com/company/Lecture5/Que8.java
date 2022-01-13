//Print given pattern
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14

package com.company.Lecture5;

public class Que8 {
    public static void main(String[] args) {
        int number=5;
        int numbers=1;

        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println();
        }
    }
}
