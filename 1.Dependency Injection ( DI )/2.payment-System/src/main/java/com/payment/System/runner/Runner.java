package com.payment.System.runner;

import com.payment.System.paymentProcessing.PaymentProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private PaymentProcessing  paymentProcessing;

    @Override
    public void run(String... args) throws Exception {

        String userChoice = "creditCard";
        paymentProcessing.processPayment(userChoice,10000);
    }
}
