package com.company.interfaces.example;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("Drum brake");
    }

    @Override
    public void start() {
        System.out.println("Auto start");
    }

    @Override
    public void stop() {
        System.out.println("Stop slowly");
    }

    @Override
    public void acc() {
        System.out.println("Medium acceleration");
    }
}
