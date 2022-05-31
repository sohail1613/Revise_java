package com.company.staticExample;

public class Human {
    int age;
    String name;
    boolean married;
    static long population;

    Human(int age, String name, boolean married){
        this.age= age;
        this.name = name;
        this.married = married;
//        this.population += 1; // to access static we need to use class name
        Human.population += 1;
    }
}
