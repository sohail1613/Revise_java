package com.company.abstractDemo;

abstract class AbstractExample {
    int num;

    public AbstractExample(int num){
        this.num=num;
    }

    abstract int multiply(int value);
}

class Example extends AbstractExample{
    Example(){
        super(2);
        System.out.println("Example Constructor called");
    }
    public int multiply(int value){
        return this.num*value;
    }
}
