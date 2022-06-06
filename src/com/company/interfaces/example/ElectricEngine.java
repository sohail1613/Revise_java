package com.company.interfaces.example;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop electric engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate electric engine");
    }
}
