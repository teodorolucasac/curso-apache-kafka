package com.teodoro.paymentservice.model;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
public class Payment implements Serializable {

    private long id;
    private long idUser;
    private long idProduct;
    private String cardNumber;
}
