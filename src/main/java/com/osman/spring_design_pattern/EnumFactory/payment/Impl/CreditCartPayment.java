package com.osman.spring_design_pattern.EnumFactory.payment.Impl;

import com.osman.spring_design_pattern.EnumFactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class CreditCartPayment implements Payment {
    @Override
    public String pay(String orderId, double amount) {
        return "Payment done using credit card in EnumType method";
    }
}
