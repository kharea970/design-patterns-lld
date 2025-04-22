package com.example.designpatternlld.abstractFactory;

import com.example.designpatternlld.abstractFactory.LuxeriousVehicles.Mercedes;
import com.example.designpatternlld.abstractFactory.LuxeriousVehicles.RoleRoyce;
import com.example.designpatternlld.abstractFactory.OrdinaryVehicles.Baleno;
import com.example.designpatternlld.abstractFactory.OrdinaryVehicles.Swift;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        return
                switch (vehicle){
                    case "Swift"->new Swift();
                    case "Baleno"->new Baleno();
                    default -> null;
                };

    }
}
