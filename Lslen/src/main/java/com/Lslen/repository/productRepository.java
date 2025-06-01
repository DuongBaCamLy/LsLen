package com.Lslen.repository;

import com.Lslen.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<product, Integer> {
    List<product> findByCategory(String category);
    List<product> findByNameContainingIgnoreCase(String keyword);
}
