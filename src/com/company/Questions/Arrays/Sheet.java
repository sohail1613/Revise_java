package com.company.Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    //https://leetcode.com/problems/spiral-matrix/
    //https://www.youtube.com/watch?v=1ZGJzvkcLsA&ab_channel=TECHDOSE
    public List<Integer> spiralOrder(int[][] matrix){
        int top = 0, left = 0, direction = 0;
        int bottom = matrix.length-1, right = matrix[0].length-1;
        int i;
        List<Integer> spiral = new ArrayList<Integer>();

        if (matrix.length == 0){
            return spiral;
        }

        while(top <= bottom && left <= right){
            if (direction == 0){ //traverse right
                for (i = top; i<= right; i++)
                    spiral.add(matrix[top][i]);
                top++;
            } else if (direction == 1) { //traverse down
                for (i=top; i<=bottom; i++)
                    spiral.add(matrix[i][right]);
                right--;
            } else if (direction == 2) { //traverse left
                for (i=right; i>=left; i--)
                    spiral.add(matrix[bottom][i]);
                bottom--;
            } else if (direction == 3) { //traverse up
                for (i=bottom; i>= top; i--)
                    spiral.add(matrix[i][left]);
                left++;
            }
            direction = (direction+1)%4;
        }
        return spiral;
    }
}
