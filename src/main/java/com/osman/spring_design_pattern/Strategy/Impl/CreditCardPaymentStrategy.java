package com.osman.spring_design_pattern.Strategy.Impl;

import com.osman.spring_design_pattern.Strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {


    @Override
    public String pay(String orderId, double amount, String paymentType) {
        return "payment done with credit card for order id: " + orderId + " amount: " + amount + " payment type: " + paymentType;
    }
}
