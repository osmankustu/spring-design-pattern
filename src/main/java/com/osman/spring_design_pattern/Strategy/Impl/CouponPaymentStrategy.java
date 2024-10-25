package com.osman.spring_design_pattern.Strategy.Impl;

import com.osman.spring_design_pattern.Strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("couponPayment")
public class CouponPaymentStrategy implements PaymentStrategy {


    @Override
    public String pay(String orderId, double amount, String paymentType) {
        return "payment done with coupon for order id: " + orderId + " amount: " + amount + " payment type: " + paymentType;
    }
}
