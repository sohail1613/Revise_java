package com.company.rough;

public class Counter {
    static int count=0; // it will get memory only one time

    Counter (){
        count++;
        System.out.println(count);
    }
}
