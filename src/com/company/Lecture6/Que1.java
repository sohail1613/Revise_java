package com.company.Lecture6;

public class Que1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                int sum = i+j;
                if (i == 1 || j == 1 || i == j || sum==11 || j==m) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }

    }
}
