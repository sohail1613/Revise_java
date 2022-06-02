package com.company.searching;

public class Linear {
    public static void main(String[] args) {
        int[] array = {1, 23 ,89, 67, 45, 18, -3, 0, -90};
        int target = 18;
        int ans = linearSearch(array, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //running a loop
        for (int index =0; index< arr.length; index++){
            //checking element at each index if its == target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //in case element does not found
        return -1;
    }
}
