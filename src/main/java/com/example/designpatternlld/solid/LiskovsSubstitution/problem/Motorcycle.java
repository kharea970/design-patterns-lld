package com.example.designpatternlld.solid.LiskovsSubstitution.problem;

public class Motorcycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 5;
    }
}
