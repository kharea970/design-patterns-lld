package com.example.designpatternlld.strategy.solution;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SpecialDriveStrategy());
    }
}
