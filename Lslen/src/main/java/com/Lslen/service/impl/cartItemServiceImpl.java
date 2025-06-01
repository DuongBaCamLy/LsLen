package com.Lslen.service.impl;

import com.Lslen.entity.cartItem;
import com.Lslen.entity.product;
import com.Lslen.entity.user;
import com.Lslen.repository.cartItemRepository;
import com.Lslen.service.cartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartItemServiceImpl implements cartItemService {

    @Autowired
    private cartItemRepository cartItemRepository;

    @Override
    public List<cartItem> getCartItemsByUser(user u) {
        return cartItemRepository.findByUser(u);
    }

    @Override
    public void addCartItem(cartItem c) {
        cartItemRepository.save(c);
    }

    @Override
    public void updateCartItem(cartItem c) {
        cartItemRepository.save(c);
    }

    @Override
    public void deleteCartItem(Integer id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public void clearCartByUser(user u) {
        cartItemRepository.deleteByUser(u);
    }

    @Override
    public cartItem getCartItemByUserAndProduct(user u, product p) {
        return cartItemRepository.findByUserAndProduct(u, p).orElse(null);
    }
}
