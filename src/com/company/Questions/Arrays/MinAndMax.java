package com.company.Questions.Arrays;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class MinAndMax {
public static int elements(int[] array){
    int min = Integer.MAX_VALUE;
    for (int a: array){
        if (min > a){
            min =a;
        }
    }
    return min;
}

public static int maxElement(int[] array){
    int max = Integer.MIN_VALUE;
    for (int a : array){
        if (max < a){
            max = a;
        }
    }
    return max;
}


    public static void main(String[] args) {
        int[] array = {2, 3, 5, 678 , 55, 90, 2,12};
        System.out.println("Minimum element in array :"+elements(array));
        System.out.println("Maximum element in array :"+maxElement(array));
    }
}
