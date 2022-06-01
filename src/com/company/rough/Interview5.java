package com.company.rough;


import java.util.Arrays;

public class Interview5{
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // count occurrence
        for (int i = 0; i < n; i++) {

            // Skip this element if already counted
            if (visited[i] == true)
                continue;

            // Count occurrence
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{ 1, 2, 2, 4, 4, 4, 3,2, 3, 6 };
        int n = arr.length;
        countFreq(arr, n);
    }
}

