package com.company.Questions.Arrays;

import java.util.Arrays;

public class Sheet {
    public int subArrayMaximum(int[] array){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
            max = Math.max(sum, max);//return te maximum of them
            //if sum is less than zero the return 0.
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    //Contains Duplicate
    public boolean containsDuplicate(int[] array){
        Arrays.sort(array);
        for (int i = 0; i<array.length-1; i++){
            if (array[i] == array[i+1])
                return true;
        }
        return false;
    }
}
