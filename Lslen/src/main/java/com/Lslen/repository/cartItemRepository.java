package com.Lslen.repository;

import com.Lslen.entity.cartItem;
import com.Lslen.entity.product;
import com.Lslen.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface cartItemRepository extends JpaRepository<cartItem, Integer> {
    List<cartItem> findByUser(user user);
    Optional<cartItem> findByUserAndProduct(user user, product product);
    void deleteByUser(user user);
}
