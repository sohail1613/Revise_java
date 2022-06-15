package com.company.polymorphism;

public class Employee {
    private int number;
    private String name;
    private String address;

    public Employee(int number, String name, String address){
        System.out.println("Constructor invoked");
        this.number = number;
        this.name = name;
        this.address= address;
    }

    public void mainCheque(){
        System.out.println("Sending cheque to "+this.name+" "+this.address);
    }

    public String toString(){
        return name+" "+number+" "+address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getNumber(){
        return number;
    }
}

//now using extends keyword to inherit Employee class
class Salary extends Employee{
    private double salary;
    public Salary(String name, int number, String address, double salary){
        super(number, name, address);
        setSalary(salary);
    }

    public void setSalary(double salary){
        if (salary > 100.0)
            this.salary = salary;
    }
}