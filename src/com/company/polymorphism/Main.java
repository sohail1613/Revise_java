package com.company.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee(29438506, "Nedal", "Adari");
//        employee.mainCheque();
//
//        Salary salary = new Salary("Hassan", 7854, "Mau", 23947.38);
//        salary.mainCheque();

        Animal animal = new Animal();
        animal.move();
        Animal bird = new Bird();
        bird.move(); //runtime polymorphism, because object of type birth which is invoked at runtime
    }
}
