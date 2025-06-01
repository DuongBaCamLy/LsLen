package com.Lslen.controller;

import com.Lslen.dto.OrderRequestDTO;
import com.Lslen.entity.order;
import com.Lslen.entity.orderDetail;
import com.Lslen.entity.user;
import com.Lslen.service.EmailService;
import com.Lslen.service.orderDetailService;
import com.Lslen.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private orderService orderService;

    @Autowired
    private orderDetailService orderDetailService;

    @Autowired
    private EmailService emailService;

    @PostMapping
public order insertOrderWithDetails(@RequestBody OrderRequestDTO request) {
    order o = request.getOrder();
    o.setOrderDate(new Timestamp(System.currentTimeMillis()));
    o.setStatus("PENDING");
    o.setTotalPrice(0.0);

    order savedOrder = orderService.insertOrderAndReturn(o);

    double total = 0;
    for (orderDetail od : request.getOrderDetails()) {
        od.setOrder(savedOrder);
        orderDetailService.insertOrderDetail(od);
        total += od.getPrice() * od.getQuantity();
    }

    savedOrder.setTotalPrice(total);
    orderService.updateOrderAndReturn(savedOrder); // Update lại total chính xác

    // Gửi email xác nhận
    try {
        emailService.sendOrderConfirmation(
            savedOrder.getEmail(),         // ✅ lấy từ order
            savedOrder.getFullName(),      // ✅ lấy từ order
            savedOrder.getId(),
            savedOrder.getTotalPrice()
        );
    } catch (Exception e) {
        System.out.println("Không thể gửi email: " + e.getMessage());
    }

    return savedOrder;
}

    @GetMapping
    public List<order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public order getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public order updateOrder(@PathVariable Integer id, @RequestBody order o) {
        o.setId(id);
        return orderService.updateOrderAndReturn(o);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);
    }

    @PostMapping("/by-user")
    public List<order> getOrdersByUser(@RequestBody user u) {
        return orderService.getOrdersByUser(u);
    }
}
