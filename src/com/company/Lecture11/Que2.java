//For a given matrix of N x M, print its transpose.

package com.company.Lecture11;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int matrix[][]=new int[n][m];

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Transpose of the matrix is :");

        //for transpose
        for (int j=0; j<m; j++){
            for (int i=0; i<n; i++){
                System.out.print(matrix);
            }
        }
    }
}
