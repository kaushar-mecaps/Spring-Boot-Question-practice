package com.payment.System.serviceImpl;

import com.payment.System.service.PaymentsService;
import org.springframework.stereotype.Service;

@Service("upi")
public class UpiPayments implements PaymentsService {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
