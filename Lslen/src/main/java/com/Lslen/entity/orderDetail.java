package com.Lslen.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class orderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore //ngat vong lap
    private order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private product product;

    private int quantity;
    private double price;

    @Column(insertable = false, updatable = false)
    private double subtotal;

    @Column(name = "create_date", insertable = false, updatable = false)
    private java.sql.Timestamp createDate;

    public orderDetail() {}

    public orderDetail(int id, order order, product product, int quantity, double price) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public order getOrder() { return order; }
    public void setOrder(order order) { this.order = order; }

    public product getProduct() { return product; }
    public void setProduct(product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getSubtotal() { return subtotal; }

    public java.sql.Timestamp getCreateDate() { return createDate; }
}
