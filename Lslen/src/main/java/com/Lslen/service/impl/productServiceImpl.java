package com.Lslen.service.impl;

import com.Lslen.entity.product;
import com.Lslen.repository.productRepository;
import com.Lslen.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements productService {

    @Autowired
    private productRepository productRepository;

    @Override
    public List<product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void insertProduct(product p) {
        productRepository.save(p);
    }

    @Override
    public void updateProduct(product p) {
        productRepository.save(p);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<product> searchProductsByName(String keyword) {
        return productRepository.findByNameContainingIgnoreCase(keyword);
    }
}
