package com.osman.spring_design_pattern.Factory.Impl;

import com.osman.spring_design_pattern.Dto.PaymentRequest;
import com.osman.spring_design_pattern.Factory.PaymentFactory;
import com.osman.spring_design_pattern.Strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactoryImpl implements PaymentFactory {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    public PaymentStrategy getPaymentStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        return paymentStrategyMap.get(paymentType);
    }

    @Override
    public String executePayment(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentRequest.paymentType());
        return paymentStrategy.pay(paymentRequest.orderId(), paymentRequest.amount(), paymentRequest.paymentType());
    }
}
