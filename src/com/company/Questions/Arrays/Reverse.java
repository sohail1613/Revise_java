package com.company.Questions.Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
public class Reverse {
    public static void reverse(int[] array){
        int start = 0; //first element of array
        int end = array.length-1; // last element of array

       while (start < end){
          swap(array, start, end); //swapping
           start++;
           end--;
       }
    }
    static void swap(int[] array, int start, int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
}
