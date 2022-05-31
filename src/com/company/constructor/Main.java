package com.company.constructor;

public class Main {
    public static void main(String[] args) {
//        InvokeConstructor ic = new InvokeConstructor();
        Student s = new Student(123, "Nedal", 34058.35f);
        Student s1 = new Student(2734, "Ansari", "CSE", 71253.3f);
        s.display();
        s1.display();
        String name = "zaid";
        name = "sohail";

    }


}
