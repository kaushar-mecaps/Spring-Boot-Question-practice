package com.Kaushar.Loose.Tight.Coupling;

import com.Kaushar.Loose.Tight.Coupling.vehicle.Vehicle;
import org.apache.catalina.LifecycleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private Vehicle vehicle;

	public static void main(String[] args) throws LifecycleException {
		SpringApplication.run(Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        vehicle.drive();
        System.out.println("Vehicle Started");
    }
}
