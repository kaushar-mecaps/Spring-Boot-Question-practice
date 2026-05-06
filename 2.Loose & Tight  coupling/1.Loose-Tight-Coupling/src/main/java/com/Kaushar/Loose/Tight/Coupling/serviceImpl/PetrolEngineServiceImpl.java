package com.Kaushar.Loose.Tight.Coupling.serviceImpl;

import com.Kaushar.Loose.Tight.Coupling.service.EngineService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngineServiceImpl implements EngineService {

    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
