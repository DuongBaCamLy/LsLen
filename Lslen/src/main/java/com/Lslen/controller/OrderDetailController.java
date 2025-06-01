package com.Lslen.controller;

import com.Lslen.entity.order;
import com.Lslen.entity.orderDetail;
import com.Lslen.service.orderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-details")
public class OrderDetailController {

    @Autowired
    private orderDetailService orderDetailService;

    @GetMapping
    public List<orderDetail> getAllOrderDetails() {
        return orderDetailService.getAllOrderDetails();
    }

    @GetMapping("/{id}")
    public orderDetail getOrderDetailById(@PathVariable Integer id) {
        return orderDetailService.getOrderDetailById(id);
    }

    @PostMapping
    public void insertOrderDetail(@RequestBody orderDetail od) {
        orderDetailService.insertOrderDetail(od);
    }

    @PutMapping("/{id}")
    public void updateOrderDetail(@PathVariable Integer id, @RequestBody orderDetail od) {
        od.setId(id);
        orderDetailService.updateOrderDetail(od);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderDetail(@PathVariable Integer id) {
        orderDetailService.deleteOrderDetail(id);
    }

    @PostMapping("/by-order")
    public List<orderDetail> getOrderDetailsByOrder(@RequestBody order o) {
        return orderDetailService.getOrderDetailsByOrder(o);
    }
}
