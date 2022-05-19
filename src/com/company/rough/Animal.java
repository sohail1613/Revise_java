package com.company.rough;

public class Animal {
    int age;
    protected String name;
    private String habit;//we can access private using getter and setter

    public String getHabit(){
        return habit;
    }
    public String setHabit(String habit){
        return this.habit=habit;
    }

    Animal(){ //constructor of type Animal
        this.age= 5;
        this.name= "Cat";
    }

    //creating another constructor with parameters
    //we can create multiple constructor, called Constructor overloading
    public Animal(int age, String name){
        this.age= age;
        this.name = name;

    }

    //another constructor
    protected   Animal(int age, String name, String habit){
        this.age=age;
        this.name=name;
        this.habit = habit;

    }


    void eat(){
        System.out.println("Eating food...");
    }
}
