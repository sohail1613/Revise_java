package com.company.polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(29438506, "Nedal", "Adari");
        employee.mainCheque();

        Salary salary = new Salary("Hassan", 7854, "Mau", 23947.38);
        salary.mainCheque();
    }
}
