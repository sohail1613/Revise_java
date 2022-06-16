package com.company.polymorphism;

public class Animal {
    public void move(){
        System.out.println("Animal moving ");
    }
}
class Fish extends Animal{
    public void move(){
        System.out.println("Fish Swimming ");
    }
}

class Horse extends Animal{
    public void move(){
        System.out.println("Horse Running");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("Bird Flying");
    }
}