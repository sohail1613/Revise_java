package com.company.keywords;

//public final class FinalExample {
//    final void display(){
//        System.out.println("parents class");
//    }
//}

public class FinalExample{
    final int EmpId;
//    private int number;
    final String name;

    public FinalExample(){
        EmpId = 1723;
        name = "Sohail";
//        number = 1;
    }

    void display(){
        System.out.println("Parent class");
    }
}
//we cannot inherit final class and cannot override final method
//it will show compile time error.
class SubFinal extends FinalExample{
    void display(){
        System.out.println("Child class");
    }
}
