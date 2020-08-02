package com.orderitem.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@RequiredArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;
    private final String productCode;
    private final String productName;
    private final Long quantity;
    private final Long orderId;
}
