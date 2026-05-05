package com.DependencyInjection.DependencyInjection.ServiceImpl;

import com.DependencyInjection.DependencyInjection.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
