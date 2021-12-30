package com.company;

public class Invertedzaid {
    public static void main(String[] args) {
        int n ; // declaration
            n = 6; // Initialization
            n = 7; //re-assign
//        int a = 3; //Declaration and Initialization
//           a = n; // the value of n is assigned to variable a
          //  int n = 5;

        for(int row =1; row <=n; row++){
            for (int colum=1; colum<=n-row+1; colum++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
