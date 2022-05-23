package com.company.Encapsulation;
//Encapsulation = Binding date with methods
public class Company {
    private int empId;
    private String name;

    //using setter and getter to access variables.
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
class Demo{
    public static void main(String[] args) {
        Company c = new Company();
//        c.empId=321; //its not right way to access directly , we should access using getters and setters method
//        c.name = "Adari";

        c.setEmpId(123); //to set value
        System.out.println(c.getEmpId()); //to fetch the value
        c.setName("Sohail");
        System.out.println(c.getName());
    }
}