package com.Lslen.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class cartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private product product;

    private int quantity;

    public cartItem() {}

    public cartItem(int id, user user, product product, int quantity) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public user getUser() { return user; }
    public void setUser(user user) { this.user = user; }

    public product getProduct() { return product; }
    public void setProduct(product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
