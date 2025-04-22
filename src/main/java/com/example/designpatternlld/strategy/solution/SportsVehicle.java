package com.example.designpatternlld.strategy.solution;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(new SpecialDriveStrategy());
    }
}
