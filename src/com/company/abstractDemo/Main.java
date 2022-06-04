package com.company.abstractDemo;

public class Main {
    public static void main(String[] args) {
//        Son s = new Son(26);
//        s.career();
//        s.city();
//        Daughter daughter = new Daughter();
//        daughter.parent.career();

//        Daughter d= new Daughter(24);
//        d.career();
//        d.city();
        AbstractExample ex = new Example();
        System.out.println(ex.multiply(5));
    }
}
