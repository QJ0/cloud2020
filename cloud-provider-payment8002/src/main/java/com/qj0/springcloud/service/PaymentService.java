package com.qj0.springcloud.service;

import com.qj0.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
