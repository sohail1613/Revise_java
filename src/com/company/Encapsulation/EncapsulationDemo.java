package com.company.Encapsulation;

//here we are binding private variable data with method(getter and setter) is called Method Binding or Encapsulation
class Student{
    private int rollNo;
    private String name;

    //to set data
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    //to fetch data
    public int getRollNo(){
        return rollNo;
    }

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args){
        Student s = new Student();
//        s.rollNo = 12334; // its not right way to directly access
//        s.name = "Ansar";// we should use getter and setters method
        s.setRollNo(2185);
        s.setName("Idris");
        System.out.println(s.getRollNo());
        System.out.println(s.getName());

    }
}
