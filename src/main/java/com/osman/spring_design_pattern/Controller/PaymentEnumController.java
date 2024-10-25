package com.osman.spring_design_pattern.Controller;

import com.osman.spring_design_pattern.Dto.PaymentRequest;
import com.osman.spring_design_pattern.EnumFactory.PaymentEnumType;
import com.osman.spring_design_pattern.Factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumController {

    @PostMapping
    public ResponseEntity<String> Payment(@RequestBody PaymentRequest paymentRequest) {

    PaymentEnumType.getPaymentType(paymentRequest.paymentType()).output();

        return ResponseEntity.ok().body(PaymentEnumType.getPaymentType(paymentRequest.paymentType())
                .getPayment()
                .pay(paymentRequest.orderId(), paymentRequest.amount()));
    }
}
