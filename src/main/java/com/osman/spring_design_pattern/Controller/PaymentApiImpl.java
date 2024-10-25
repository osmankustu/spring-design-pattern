package com.osman.spring_design_pattern.Controller;

import com.osman.spring_design_pattern.EnumFactory.PaymentEnumType;
import com.osman.spring_design_pattern.gen.api.PaymentApi;
import com.osman.spring_design_pattern.gen.model.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApiImpl implements PaymentApi {
    @Override
    public ResponseEntity<String> payment(PaymentRequest paymentRequest) {

        return ResponseEntity.ok().body(PaymentEnumType.getPaymentType(paymentRequest.getPaymentType())
                .getPayment()
                .pay(paymentRequest.getOrderId(), paymentRequest.getAmount()));
    }
}
