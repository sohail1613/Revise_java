

package com.company.Lecture5;

public class Rhombus {
    public static void main(String[] args) {
        int row = 5;
        int column = 9;

        for (int i=1; i<=row; i++) {
            for (int j=1; j<=column; j++){
                int sum = i+j;
                if (sum==6 || sum==7 || sum==8 || sum==9 || sum==10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

