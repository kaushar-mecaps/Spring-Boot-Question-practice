package com.DependencyInjection.DependencyInjection;

import com.DependencyInjection.DependencyInjection.manager.NotificationManager;
import com.DependencyInjection.DependencyInjection.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {
    @Autowired
    private NotificationManager manager;

	public static void main(String[] args) {
		var contex = SpringApplication.run(DependencyInjectionApplication.class, args);

        NotificationManager manager = (NotificationManager) contex.getBean(NotificationManager.class);
        manager.sendNotification("Hello DependencyInjection");
	}

}
