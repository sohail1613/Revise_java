//Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

package com.company.Lecture11;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int [][] matrix=new int[n][m];

        //input from user
        for (int i=0; i<n; i++){
            //column
            for (int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Spiral order of the matrix is :");

        int rowStart=0;
        int rowEnd=n-1;
        int colStart=m;
        int colEnd=m-1;

        while (rowStart<=rowEnd && colStart<=colEnd){
            for (int col=colStart; col<=colEnd; col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;

            for (int row=rowStart; row<=rowEnd; row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;

            for (int col=colEnd; col>=colStart; col++){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;

            for (int row=rowEnd; row>=rowStart; row--){
                System.out.print(matrix[row][colStart]+" ");
            }
            colStart++;

            System.out.println();
        }
    }
}
