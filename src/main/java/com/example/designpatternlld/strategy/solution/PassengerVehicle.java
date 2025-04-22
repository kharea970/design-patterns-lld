package com.example.designpatternlld.strategy.solution;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStartegy());
    }
}
