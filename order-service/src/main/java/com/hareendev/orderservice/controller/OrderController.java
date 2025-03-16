package com.hareendev.orderservice.controller;

import com.hareendev.orderservice.dto.OrderRequest;
import com.hareendev.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody OrderRequest orderRequest) {
       orderService.placeOrder(orderRequest);
        return "Order created successfully";
    }
}
