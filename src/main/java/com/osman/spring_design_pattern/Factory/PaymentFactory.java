package com.osman.spring_design_pattern.Factory;

import com.osman.spring_design_pattern.Dto.PaymentRequest;

public interface PaymentFactory {

    String executePayment(PaymentRequest paymentRequest);
}
