package com.company.interfaces;
interface Demo{
    default void show(){ //we need to use "default" keyword, otherwise it will give error
        System.out.println("with default");
    }
}
interface SecondDemo{
    default void show(){
        System.out.println("In secondDemo.");
    }
}

class Sub implements Demo, SecondDemo{
    public void xyz(){
        System.out.println("xyz method");
       // System.err.println("abcd"); //output will be in red color cause of err means error
    }
    //we can also override show method
//    public void show(){
//        System.out.println("Overriding show method.");
//    }
    //another way to solve ambiguity
    @Override
    public void show(){
       // Demo.super.show();
        SecondDemo.super.show();
    }
}

public class DefaultInterface {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.xyz();
        obj.show();
    }
}
