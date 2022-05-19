package com.company.rough;

class Outer{
    int a; //it is member variable
    public void show(){ //member method

    }

    //we can create class inside class
    static class Inner{ //member class
        public void display(){
            System.out.println("Displaying..."); // to display we need to create object of inner class
        }
    }
}


public class InnerExample {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        //Inner in = new Inner(); // compile time error because we don't have access
        //to solve such issue we need to do
        //in order to use the outer class we need specify the outer class
        //to use inner class object we need to specify the inner class object
        //Outer.Inner in = obj.new Inner();

        //in case if class is also static then we n don't need to specify outer cass object
        Outer.Inner in = new Outer.Inner();
        in.display();
    }
}
