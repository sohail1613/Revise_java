//Print Pascal's triangle


package com.company.Lecture6;

public class Que3 {
    public static void main(String[] args) {
        int number=5;

        for (int i=1; i<=number; i++){
            //printing spaces
            for (int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //printing numbers
            for (int j=1; j<=number; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
