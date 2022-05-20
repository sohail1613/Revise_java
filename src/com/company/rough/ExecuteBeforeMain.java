package com.company.rough;

public class ExecuteBeforeMain {
    int number;
    String name;
    static String company;

    static {
        System.out.println("Static first");
    }

    ExecuteBeforeMain(){
        System.out.println("After static block");
    }
}
