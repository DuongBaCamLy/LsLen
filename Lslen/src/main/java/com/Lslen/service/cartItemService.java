package com.Lslen.service;

import com.Lslen.entity.cartItem;
import com.Lslen.entity.product;
import com.Lslen.entity.user;

import java.util.List;

public interface cartItemService {
    List<cartItem> getCartItemsByUser(user u);
    void addCartItem(cartItem c);
    void updateCartItem(cartItem c);
    void deleteCartItem(Integer id);
    void clearCartByUser(user u);
    cartItem getCartItemByUserAndProduct(user u, product p);
}
