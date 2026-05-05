package com.payment.System.serviceImpl;

import com.payment.System.service.PaymentsService;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPayment implements PaymentsService {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
