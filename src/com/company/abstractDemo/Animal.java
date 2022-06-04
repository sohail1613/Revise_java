package com.company.abstractDemo;

class Animal {
    String running;
    public Animal(String running){
        this.running = running;
    }
    public Animal(){
        System.out.println("hello world");
    }
    //public abstract void voice();

    static void walk(){
        System.out.println("walking.");
    }

    public void move(){
        System.out.println(getClass().getSimpleName()+" is moving.");
    }
}

class Dog extends Animal{
//    @Override
//    public void voice(){
//        System.out.println("boow boow...");
//    }

    @Override
    public void move() {
//        super.move();
        System.out.println("move");
    }
}

class Cat extends Animal{
    public Cat(){
        super("Cat constructor calling");
    }
    public String voice(){
        return this.running+" + cat method";
    }
}

class Sheep extends Animal{
    public void voice(){
        System.out.println("baa baa");
    }
}

class AbstractAnimal{
    public static void main(String[] args) {
//        Dog dog = new Dog();
////        dog.voice();
//        dog.move();
//        Dog.walk();

        Animal cat = new Cat();
        System.out.println(cat.running);
//        Animal sheep = new Sheep();


    }
}
