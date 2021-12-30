//Print Floyd's Triangle
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

package com.company;

public class Floyd {
    public static void main(String[] args) {
        int n = 5 ;
        int number = 1;
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;

            }
            System.out.println();
        }
    }
}
