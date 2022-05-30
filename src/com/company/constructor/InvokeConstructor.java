package com.company.constructor;

public class InvokeConstructor {
    InvokeConstructor(){
        this(8346);
        System.out.println("Invoking current class constructor");
    }
    InvokeConstructor(int a){
//        this(8274360);
        System.out.println(a);
    }
}
