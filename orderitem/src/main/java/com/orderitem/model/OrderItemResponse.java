package com.orderitem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderItemResponse {
    private String productCode;
    private String productName;
    private Long quantity;
}
