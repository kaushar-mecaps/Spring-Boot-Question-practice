package com.payment.System.paymentProcessing;

import com.payment.System.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentProcessing {

    @Autowired
    private Map<String, PaymentsService>  paymentsServiceMap;

    public void processPayment(String type, double amount) {
        PaymentsService paymentsService = paymentsServiceMap.get(type);
        if (paymentsService ==  null) {
            throw new RuntimeException("Invalid Payment Service Type");
        }

        paymentsService.pay(amount);
    }
}
