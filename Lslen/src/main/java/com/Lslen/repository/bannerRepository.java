package com.Lslen.repository;

import com.Lslen.entity.banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bannerRepository extends JpaRepository<banner, Integer> {
    List<banner> findByActiveTrue();
}
