package com.osman.spring_design_pattern.Dto;

public record PaymentRequest(
        String orderId,
        double amount,
        String paymentType) {
}
