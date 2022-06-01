package com.company.rough;

public class Interview4 {
    public static String searchArray(int[][] array1, int[] array2){
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1.length; j++){
                for(int k=0; k<array2.length; k++){
                    if(array1[i][j] == array2[k]){
                        return "Yes";
                    }
                }
            }
        }
        return "No";
    }
    public static void main(String[] args){
        int[][] array1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] array2 = {5, 6, 7, 8};
        System.out.println(searchArray(array1, array2));
    }
}
