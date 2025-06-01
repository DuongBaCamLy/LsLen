package com.Lslen.controller;

import com.Lslen.entity.cartItem;
import com.Lslen.entity.product;
import com.Lslen.entity.user;
import com.Lslen.service.cartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartItemController {

    @Autowired
    private cartItemService cartItemService;

    @PostMapping("/by-user")
    public List<cartItem> getCartItemsByUser(@RequestBody user u) {
        return cartItemService.getCartItemsByUser(u);
    }

    @PostMapping
    public void addCartItem(@RequestBody cartItem c) {
        cartItemService.addCartItem(c);
    }

    @PutMapping("/{id}")
    public void updateCartItem(@PathVariable Integer id, @RequestBody cartItem c) {
        c.setId(id);
        cartItemService.updateCartItem(c);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Integer id) {
        cartItemService.deleteCartItem(id);
    }

    @PostMapping("/clear")
    public void clearCartByUser(@RequestBody user u) {
        cartItemService.clearCartByUser(u);
    }

    @PostMapping("/get-item")
    public cartItem getCartItemByUserAndProduct(@RequestBody CartQuery query) {
        return cartItemService.getCartItemByUserAndProduct(query.user, query.product);
    }

    static class CartQuery {
        public user user;
        public product product;
    }
}
