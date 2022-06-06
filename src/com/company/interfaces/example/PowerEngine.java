package com.company.interfaces.example;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop power engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate power engine");
    }
}
