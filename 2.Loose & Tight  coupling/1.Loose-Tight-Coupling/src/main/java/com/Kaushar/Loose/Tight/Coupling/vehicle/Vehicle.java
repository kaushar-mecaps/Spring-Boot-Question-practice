package com.Kaushar.Loose.Tight.Coupling.vehicle;

import com.Kaushar.Loose.Tight.Coupling.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private final EngineService engineService;

    @Autowired
    public Vehicle(@Qualifier ("dieselEngineServiceImpl")
            EngineService engineService) {

        this.engineService = engineService;
    }

    public void drive() {
        engineService.start();
        System.out.println("Vehicle is running...");
    }
}
