package com.example.designpatternlld.abstractFactory;

public class VehicleStore {
    public static void main(String[] args) {
        VehicleFactory ordinaryVFactory = new OrdinaryVehicleFactory();
        Vehicle baleno = ordinaryVFactory.getVehicle("Baleno");
        System.out.println(baleno.average());

        VehicleFactory luxuryVFactory = new LuxeriousVehicleFactory();
        Vehicle mercedes = luxuryVFactory.getVehicle("Mercedes");
        System.out.println(mercedes.average());

    }
}
