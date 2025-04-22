package com.example.designpatternlld.strategy.solution;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Drive to SpecialDrive");
    }
}
