//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//print these pattern

package com.company.Lecture5;

public class Que6 {
    public static void main(String[] args) {
        int number=5;

        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
