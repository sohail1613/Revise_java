package com.company.Lecture5;

public class Que2 {
    public static void main(String[] args) {
        int n =5;
        int m=9;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                int sum=i+j;
                if (sum==6 || sum==8 || sum==10 || sum==12 || sum==14) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
