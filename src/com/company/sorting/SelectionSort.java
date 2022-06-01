package com.company.sorting;

public class SelectionSort {
    public void selectionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
