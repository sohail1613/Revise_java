package com.company.searching;
//search 1-D array in 2-D array, if found return 'Yes'.

public class SearchArray {
    static String arraySearch(int[][] array, int[] target){
        //base condition return -1, if array length == 0
        if (array.length == 0)
            return "Zero Sized array";
        for (int i=0; i< array.length; i++){
            for (int j = i; j<array[i].length; j++){
                for (int k =0; k< target.length; k++){
                    if (array[i][j] == target[k])
                        return "Yes, array exist";
                }
            }
//            return "Yes, array exist";
        }

        return "No, array not found";
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {10, 11, 12, 13, 14}};
        int[] target = {4, 5, 7, 13, 14};
        String ans = arraySearch(array, target);
        System.out.println(ans);
    }
}
