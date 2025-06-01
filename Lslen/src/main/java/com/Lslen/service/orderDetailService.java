package com.Lslen.service;

import com.Lslen.entity.order;
import com.Lslen.entity.orderDetail;

import java.util.List;

public interface orderDetailService {
    List<orderDetail> getAllOrderDetails();
    orderDetail getOrderDetailById(Integer id);
    void insertOrderDetail(orderDetail od);
    void updateOrderDetail(orderDetail od);
    void deleteOrderDetail(Integer id);
    List<orderDetail> getOrderDetailsByOrder(order o);
}
