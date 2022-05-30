package com.company;

public class Variables {
    public static void main(String[] args) {
        float f = 50.0f;
//    i //compile time error
        int a = (int)f; // Narrowing or type casting
        System.out.println(f);
        System.out.println(a);
    }

}
