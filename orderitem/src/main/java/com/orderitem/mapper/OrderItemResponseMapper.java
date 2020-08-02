package com.orderitem.mapper;

import com.orderitem.entity.OrderItem;
import com.orderitem.model.OrderItemResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderItemResponseMapper {
    public List<OrderItemResponse> map(List<OrderItem> orderItems) {
        return orderItems.stream().
                map(orderItem -> new OrderItemResponse(orderItem.getProductCode(), orderItem.getProductName(), orderItem.getQuantity()))
                .collect(Collectors.toList());
    }
}
