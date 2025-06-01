package com.Lslen.dto;

import com.Lslen.entity.order;
import com.Lslen.entity.orderDetail;

import java.util.List;

public class OrderRequestDTO {
    private order order;
    private List<orderDetail> orderDetails;

    public order getOrder() {
        return order;
    }

    public void setOrder(order order) {
        this.order = order;
    }

    public List<orderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<orderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
