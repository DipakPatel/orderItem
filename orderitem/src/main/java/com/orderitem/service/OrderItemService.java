package com.orderitem.service;

import com.orderitem.mapper.OrderItemRequestMapper;
import com.orderitem.mapper.OrderItemResponseMapper;
import com.orderitem.model.OrderItemRequest;
import com.orderitem.model.OrderItemResponse;
import com.orderitem.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderItemService {
    OrderItemRepository orderItemRepository;
    OrderItemResponseMapper orderItemResponseMapper;
    OrderItemRequestMapper orderItemRequestMapper;

    public List<OrderItemResponse> getItem(Long orderId) {
        return orderItemResponseMapper.map(orderItemRepository.findAllOrderItemsByorderId(orderId));
    }

    public void saveItem(List<OrderItemRequest> orderItemRequest, Long orderId) {
        orderItemRepository.saveAll(orderItemRequestMapper.map(orderItemRequest, orderId));
    }
}
