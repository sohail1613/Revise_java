package com.company.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be Hafiz");
    }

    @Override
    void city() {
        System.out.println("city Mau");
    }
}