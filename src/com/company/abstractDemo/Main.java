package com.company.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(26);
        s.career();
        s.city();

        Daughter d= new Daughter(24);
        d.career();
        d.city();
    }
}
