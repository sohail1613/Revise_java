package com.company.searching;

public class LinearSearching {
    static int linearSearching(int[] array, int target){
        //return -1 if array length == 0
        if (array.length == 0){
            return -1;
        }

        //creating pointer variables
        int start = array[0];
        int end = array.length-1;

        while(start <= end){
            //creating mid variable
            int mid = start + (end - start)/2;
            //iterating on given array
           if (target > array[mid]){
               start = mid+1;
           } else if (target < array[mid]){
               end = mid-1;
           } else {
               return mid;
           }
        }
        return -1; // in case if the target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 45, 6, 3, 78, -9, -3, -1, -78, 0};
        int target = -3;
        int ans = linearSearching(array, target);
        System.out.println("Element found at index : "+ans);
    }
}
