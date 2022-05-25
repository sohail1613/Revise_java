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

    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] array){
        int count= 0;
        for (int a : array){
            if (count == 0 || a > array[count-1]){
                array[count++] = a;
            }
        }
        return count;
    }

    //Next permutation
    //https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
    public void nextPermutation(int[] nums) {
            if(nums == null || nums.length-1 <= 1) return;
            int i=nums.length-2;

            while(i >= 0 && nums[i] >= nums[i+1]) i--;

            if(i >= 0){
                int j = nums.length-1;
                while(nums[j] <= nums[i]) j--;
                swap(nums, i, j);
            }
            reverse(nums, i+1, nums.length-1);
        }

        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public void reverse(int[] nums, int i, int j){
            while(i < j)
                swap(nums, i++, j--);
    }
}
