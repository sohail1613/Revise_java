package com.company.staticExample;

public class Main {
    public static void main(String[] args){
        Human human1 = new Human(26, "Ansar", false);
        Human human2 = new Human(25, "Bahcivan", false);

//        System.out.println(human1);
//        System.out.println(human2);

        //do not access static variables with object reference instead use class name.
//        System.out.println(human1.population);
//        System.out.println(human2.population);
//        System.out.println(Human.population);
        //System.out.println(Human.population);

    }
}
