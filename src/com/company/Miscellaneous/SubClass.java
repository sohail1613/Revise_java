package com.company.Miscellaneous;

import com.company.rough.Animal;

public class SubClass extends Animal {

    protected SubClass(int age, String name, String habit) {
        super(age, name, habit);
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass(23, "Sohail", "Cheering");
        String n = sub.name;
    }
}