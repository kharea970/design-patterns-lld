package com.example.designpatternlld.strategy.solution;

public class Main{

public static void main(String[] args) {
    Vehicle vehicle = new SportsVehicle(new SpecialDriveStrategy());
    vehicle.drive();
}
        }
