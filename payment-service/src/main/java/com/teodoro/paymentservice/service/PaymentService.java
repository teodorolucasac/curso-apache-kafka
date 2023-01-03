package com.teodoro.paymentservice.service;

import com.teodoro.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
