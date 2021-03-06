package com.company.constructor;

public class Student {
    int rollNo;
    String name, department;
    float fees;

    Student(){//default or non parameterized constructor.
        System.out.println("Non-parameterized constructor");
    }
    Student(int rollNo, String name, float fees){ //parameterized constructor
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }

    Student(int rollNo, String name, String department, float fees){
//        this.rollNo = rollNo;
//        this.name = name;
//        this.fees = fees;
        this(rollNo, name, fees); //reusing constructor, instead of above 3 lines
        this.department = department;
    }

    public void display(){
        System.out.println(rollNo+" "+name+" "+department+" "+fees);
    }


}
