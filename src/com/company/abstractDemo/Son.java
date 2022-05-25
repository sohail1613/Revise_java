package com.company.abstractDemo;

public class Son extends Parent{
    public Son(int age){
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be Aalim");
    }

    @Override
    void city() {
        System.out.println("In city Adari");
    }
}
