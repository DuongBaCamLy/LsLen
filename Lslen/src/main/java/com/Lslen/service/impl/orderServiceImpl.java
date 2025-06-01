package com.Lslen.service.impl;

import com.Lslen.entity.order;
import com.Lslen.entity.user;
import com.Lslen.repository.orderRepository;
import com.Lslen.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderServiceImpl implements orderService {

    @Autowired
    private orderRepository orderRepository;

    @Override
    public List<order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public order getOrderById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void insertOrder(order o) {
        orderRepository.save(o);
    }

    @Override
    public order insertOrderAndReturn(order o) {
        return orderRepository.save(o);
    }

    @Override
    public void updateOrder(order o) {
        orderRepository.save(o);
    }

    @Override
    public order updateOrderAndReturn(order o) {
        return orderRepository.save(o);
    }

    @Override
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<order> getOrdersByUser(user u) {
        return orderRepository.findByUser(u);
    }
}
