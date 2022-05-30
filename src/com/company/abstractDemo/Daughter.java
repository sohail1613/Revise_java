package com.company.abstractDemo;

import com.company.Encapsulation.EncapsulationDemo;

import java.sql.Array;

public class Daughter {

    int[] arr  = {10, 13, 8,17};

    public void sorting() {
//        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int max = ;
            int lastPosition = arr.length - i;
            for (int j = 1; j <= lastPosition; j++) {
                if (max <= arr[j]){
                    max = arr[j];
                    swap(max, j);
                }
            }
        }
    }

    public void swap(int max, int j){
        int temp = max;
        arr[j] = max
    }


    Parent parent = new Parent() {

        void career() {
            System.out.println("hello");
            encapsulationDemo.main(new String[]{"hello"});
        }

        @Override
        void city() {
            System.out.println("world");
        }
    };
}
//    public Daughter(int age){
//        this.age = age;
//    }
//
//    @Override
//    void career() {
//        System.out.println("I am going to be Hafiz");
//    }
//
//    @Override
////    void city() {
////        System.out.println("city Mau");
////    }
//}