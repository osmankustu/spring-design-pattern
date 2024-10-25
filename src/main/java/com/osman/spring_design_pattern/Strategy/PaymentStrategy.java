package com.osman.spring_design_pattern.Strategy;

public interface PaymentStrategy  {

    String pay(String orderId, double amount, String paymentType);
}
