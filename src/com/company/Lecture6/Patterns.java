//Print Hollow Rhombus.

package com.company.Lecture6;

public class Patterns {
    public static void main(String[] args) {
        int n=5;
         for (int i=1; i<=n; i++){
             //printing spaces
             for (int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             //stars
             for (int j=1; j<=n; j++){
                 // applying boundary conditions.
                 if ( i==1 || i==n || j==1 || j==n ){
                     System.out.print("*");
                 }else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
