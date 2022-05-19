package com.company.rough;

public class StaticExample {
     int empId;//Instance variable
    String name;
    static String company = "Ansar"; //static variable

    //constructor
    StaticExample(int Id, String naam){
        empId= Id;//this and super cannot be used in static context
        name = naam;
    }

    //creating method for displaying
    void display(){
        System.out.println(empId+" : "+name+" : "+company);
    }
}
