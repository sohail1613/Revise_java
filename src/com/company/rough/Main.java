package com.company.rough;

public class Main {
    public static void main(String[] args) {
//        Test t = new Test();
//        int r= 67;
//        System.out.println(t.getAns());

        //creating object for cat
        Animal cat = new Animal();
        System.out.println(cat.age);
        System.out.println(cat.name);
        cat.eat(); // method calling

        //crating object for Dog
        Animal cakal = new Animal(15, "Cakal");
        System.out.println("Age is :"+cakal.age);
        System.out.println("Name is :"+cakal.name);
        cakal.eat(); // calling method eat

        Animal bird = new Animal(5, "Piegon", "Cheering");
        System.out.println(bird.age);
        System.out.println(bird.name);
        System.out.println(bird.getHabit());
    }
}
