package com.company.rough;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.main();
//        Test t = new Test();
//        int r= 67;
//        System.out.println(t.getAns());

        //creating object for cat
//        Animal cat = new Animal();
//        System.out.println(cat.age);
//        System.out.println(cat.name);
//        cat.eat(); // method calling
//
//        //crating object for Dog
//        Animal cakal = new Animal(15, "Cakal");
//        System.out.println("Age is :"+cakal.age);
//        System.out.println("Name is :"+cakal.name);
//        cakal.eat(); // calling method eat
//
//        Animal bird = new Animal(5, "Piegon", "Cheering");
//        System.out.println(bird.age);
//        System.out.println(bird.name);
//        System.out.println(bird.getHabit());

//        Operation op = new Operation();
//        System.out.println("Before changing: "+op.data);
//        op.change(567);
//        System.out.println("After changing: "+op.data);

//        Reference rf = new Reference();
//        System.out.println("Before changing: "+rf.data);
//        rf.change(rf);
//        System.out.println("Before changing: "+rf.data);


        Car c = new Car();
        c.honk();
    }
    //we can also overload the main method
    public static void main(){
        System.out.println("Main method overloaded.");
    }
}
