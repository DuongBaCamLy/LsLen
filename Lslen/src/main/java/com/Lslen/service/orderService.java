package com.Lslen.service;

import com.Lslen.entity.order;
import com.Lslen.entity.user;

import java.util.List;

public interface orderService {
    List<order> getAllOrders();
    order getOrderById(Integer id);
    void insertOrder(order o);
    order insertOrderAndReturn(order o);
    void updateOrder(order o);
    order updateOrderAndReturn(order o);
    void deleteOrder(Integer id);
    List<order> getOrdersByUser(user u);
}
