package com.Lslen.repository;

import com.Lslen.entity.order;
import com.Lslen.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface orderRepository extends JpaRepository<order, Integer> {
    List<order> findByUser(user user);
}
