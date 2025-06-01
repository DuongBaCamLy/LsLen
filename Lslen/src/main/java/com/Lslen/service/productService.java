package com.Lslen.service;

import com.Lslen.entity.product;

import java.util.List;

public interface productService {
    List<product> getAllProducts();
    product getProductById(Integer id);
    void insertProduct(product p);
    void updateProduct(product p);
    void deleteProduct(Integer id);
    List<product> getProductsByCategory(String category);
    List<product> searchProductsByName(String keyword);
}
