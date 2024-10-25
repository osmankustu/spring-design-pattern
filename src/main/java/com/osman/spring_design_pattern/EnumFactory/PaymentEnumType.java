package com.osman.spring_design_pattern.EnumFactory;

import com.osman.spring_design_pattern.EnumFactory.payment.Impl.CreditCartPayment;
import com.osman.spring_design_pattern.EnumFactory.payment.Impl.WireTransferPayment;
import com.osman.spring_design_pattern.EnumFactory.payment.Payment;

public enum PaymentEnumType {

    CREDIT_CARD("creditCard",new CreditCartPayment()){

        @Override
        public void output() {
            System.out.println("Payment done using credit card");
        }
    } ,
    WIRE_TRANSFER("wireTransfer",new WireTransferPayment()) {

        @Override
        public void output() {
            System.out.println("Payment done using wire transfer");
        }
    } ;

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }


    public Payment getPayment() {
        return payment;
    }

    public String getValue() {
        return value;
    }

    public static PaymentEnumType getPaymentType(String value) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.getValue().equals(value)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Invalid payment type: " + value);
    }

    abstract public void output();
}
