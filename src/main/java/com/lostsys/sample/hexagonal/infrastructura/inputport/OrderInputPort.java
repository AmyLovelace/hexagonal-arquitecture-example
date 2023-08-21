package com.lostsys.sample.hexagonal.infrastructura.inputport;

import java.math.BigDecimal;

import com.lostsys.sample.hexagonal.dominio.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
