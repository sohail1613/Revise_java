package com.company.rough;

public class Helper {
    int id;
    String name;

    //to invoke default constructor
    public Helper(){
        System.out.println("Default constructor");
        this.show();
    }

    private void show() {
        System.out.println("method from helper class");
    }

    public Helper(int id, String name){
        this(); // it must be first statement otherwise it will give compile-time error
        this.id=id;
        this.name=name;
        //this(); // not allowed, only it should be first statement.
    }


    public String toString(){
        return "Name :"+this.name+" id :"+this.id;
    }
}
