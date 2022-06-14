package com.company.keywords;

public class InheritanceExample {
   void running(){
       System.out.println("running");
   }
}

class Child extends InheritanceExample{
    void walk(){
        System.out.println("walking");
    }
}
class subChild extends InheritanceExample{
    void eat(){
        System.out.println("Eating");
    }
}
class RevisionExample{
    public static void main(String[] args) {
//        InheritanceExample inheritanceExample = new Child();
//        inheritanceExample.running();//we call it using objects
//        // we cannot directly call it using objects
//        // but we can cal it in this way
//        new subChild().eat();

        Child child = new Child();
        child.walk();

//        child.eat();// we can't call it because child does not have eat property
        new subChild().eat(); // in this way we can
    }
}
