package com.Lslen.service.impl;

import com.Lslen.entity.order;
import com.Lslen.entity.orderDetail;
import com.Lslen.entity.product;
import com.Lslen.repository.orderDetailRepository;
import com.Lslen.repository.productRepository;
import com.Lslen.service.orderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderDetailServiceImpl implements orderDetailService {

    @Autowired
    private orderDetailRepository orderDetailRepository;

    @Autowired
    private productRepository productRepo;

    @Override
    public List<orderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public orderDetail getOrderDetailById(Integer id) {
        return orderDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void insertOrderDetail(orderDetail od) {
        int productId = od.getProduct().getId();
        product p = productRepo.findById(productId).orElse(null);

        if (p != null) {
            od.setPrice(p.getPrice()); // Gán giá tại thời điểm đặt hàng
        }

        orderDetailRepository.save(od);
    }

    @Override
    public void updateOrderDetail(orderDetail od) {
        int productId = od.getProduct().getId();
        product p = productRepo.findById(productId).orElse(null);

        if (p != null) {
            od.setPrice(p.getPrice()); // Gán lại giá tại thời điểm cập nhật
        }

        orderDetailRepository.save(od);
    }

    @Override
    public void deleteOrderDetail(Integer id) {
        orderDetailRepository.deleteById(id);
    }

    @Override
    public List<orderDetail> getOrderDetailsByOrder(order o) {
        return orderDetailRepository.findByOrder(o);
    }
}
