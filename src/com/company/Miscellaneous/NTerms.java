//print n terms of the following series-
//1-2+4-8+16-32+64....upto n terms
//in the end print the sum of all n terms

package com.company.Miscellaneous;

public class NTerms {
    public static void main(String[] args) {
        int series = 7;
        nTermsSeries(series);
    }

    public static void nTermsSeries(int series){
        int sum=0, term = 1;
        if (series <= 0)
            System.out.println("Enter positive integer value: ");
        for (int i=0; i<series; i++){
            System.out.println(term);
            sum += term;
            term *= (-2);
        }
        System.out.println("Total sum of n terms are :"+sum);
    }
}
