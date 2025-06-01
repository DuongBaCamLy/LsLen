package com.Lslen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "total_price")
    private double totalPrice;

    private String status;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "full_name")
    private String fullName;

    private String country;
    private String street;
    private String apartment;
    private String postcode;
    private String city;
    private String phone;
    private String email;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String notes;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<orderDetail> orderDetails;

    public order() {}

    public order(int id, user user, Timestamp orderDate, double totalPrice, String status, String shippingAddress,
                 String fullName, String country, String street, String apartment, String postcode,
                 String city, String phone, String email, String notes) {
        this.id = id;
        this.user = user;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.fullName = fullName;
        this.country = country;
        this.street = street;
        this.apartment = apartment;
        this.postcode = postcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }
}
