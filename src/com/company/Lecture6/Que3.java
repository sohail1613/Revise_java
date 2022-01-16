//Print Pascal's triangle
//https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/

package com.company.Lecture6;

public class Que3 {
    public static void main(String[] args) {
        int number=5;
        Que3 g=new Que3();

        for (int i=1; i<=number; i++){
            //printing spaces
            for (int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //printing numbers
            for (int j=1; j<=i; j++){
                System.out.print(" "+g.factorial(i)/(g.factorial(i-j)*g.factorial(j)));
            }
            System.out.println();
        }
    }
    public int factorial(int i){
        if (i == 0)
            return  1;
        return i*factorial(i-1);

    }
}
