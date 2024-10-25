package com.osman.spring_design_pattern.Controller;

import com.osman.spring_design_pattern.Dto.PaymentRequest;
import com.osman.spring_design_pattern.Factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> Payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok().body(paymentFactory.executePayment(paymentRequest));
    }
}
