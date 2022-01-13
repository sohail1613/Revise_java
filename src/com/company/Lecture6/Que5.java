//Print solid diamond pattern.

package com.company.Lecture6;

public class Que5 {
    public static void main(String[] args) {
        int number=4;

        //upper half
        for (int i=1; i<=number; i++){
            for (int j=1; j<=number-i; j++){
                //printing spaces
                System.out.print(" ");
            }

            //printing stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i=number; i>=1; i--){
            for (int j=1; j<=number-i; j++){
                //printing spaces
                System.out.print(" ");
            }

            //printing stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
