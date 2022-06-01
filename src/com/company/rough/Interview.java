package com.company.rough;

import java.util.Arrays;
import java.util.Collections;

class Interview{
    public static int kthSmallest(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args){
        Integer[] arr = new Integer[] {4, 6, 2, 0, -1};
        int k =1;
        System.out.println("kth Smallest element is :"+kthSmallest(arr, k));
    }
}
