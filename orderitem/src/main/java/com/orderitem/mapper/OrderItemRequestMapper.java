package com.orderitem.mapper;

import com.orderitem.entity.OrderItem;
import com.orderitem.model.OrderItemRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderItemRequestMapper {
    public List<OrderItem> map(List<OrderItemRequest> orderItemRequests, Long orderId) {
        return orderItemRequests.stream().
                map(orderItemRequest -> new OrderItem(orderItemRequest.getProductCode(), orderItemRequest.getProductName(), orderItemRequest.getQuantity(), orderId))
                .collect(Collectors.toList());
    }
}
