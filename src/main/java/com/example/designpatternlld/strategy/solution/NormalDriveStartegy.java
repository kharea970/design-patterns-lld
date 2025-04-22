package com.example.designpatternlld.strategy.solution;

public class NormalDriveStartegy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NormalDrive is driving");
    }
}
