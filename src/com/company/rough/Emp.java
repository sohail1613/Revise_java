package com.company.rough;

public class Emp {
    int id;
    String name;
    double salary;
    static String ceo;

    static{ //Executed when we load a class
        //static is same for all objects while Non-Statics are different for everyone
        ceo = "Sohail";
        System.out.println("in static");
    }
    //doesn't matter how many times we create an object but class will load only once

    public Emp(){ //executed when we create an object
        id = 1;
        salary = 3248;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(id+" "+name+" "+salary+" "+ceo);
    }
}


class Demo{
    public static void main(String[] args) {
        Emp nedal = new Emp();
        nedal.show();

        Emp seraj = new Emp();
        seraj.show();
    }
}