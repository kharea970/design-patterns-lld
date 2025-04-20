package com.example.designpatternlld.solid.LiskovsSubstitution.problem;

public class Bicycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
        // do something(narrowing the capability of parent)
    }
}
