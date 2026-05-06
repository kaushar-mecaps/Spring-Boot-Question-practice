package com.Kaushar.Loose.Tight.Coupling.serviceImpl;

import com.Kaushar.Loose.Tight.Coupling.service.EngineService;
import org.springframework.stereotype.Component;

@Component
public class ElectricEngineServiceClass implements EngineService {

    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }

}
