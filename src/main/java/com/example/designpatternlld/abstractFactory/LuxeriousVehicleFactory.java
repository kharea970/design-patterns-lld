package com.example.designpatternlld.abstractFactory;

import com.example.designpatternlld.abstractFactory.LuxeriousVehicles.Mercedes;
import com.example.designpatternlld.abstractFactory.LuxeriousVehicles.RoleRoyce;

public class LuxeriousVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        return 
                switch (vehicle){
                    case "Mercedes"->new Mercedes();
                    case "RoleRoyce"->new RoleRoyce();
                    default -> null;
                };
        
    }
}
