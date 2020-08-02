package com.orderitem.controller;

import com.orderitem.model.OrderItemRequest;
import com.orderitem.model.OrderItemResponse;
import com.orderitem.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@AllArgsConstructor
public class OrderItemController {

    private OrderItemService orderItemService;

    @PostMapping("/{orderId}")
    private ResponseEntity addOrderItem(@RequestBody List<OrderItemRequest> orderItemRequest, @PathVariable Long orderId) {
        orderItemService.saveItem(orderItemRequest, orderId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    private ResponseEntity<List<OrderItemResponse>> getOrderItem(@PathVariable Long orderId) {
        return new ResponseEntity<>(orderItemService.getItem(orderId), HttpStatus.OK);
    }
}
