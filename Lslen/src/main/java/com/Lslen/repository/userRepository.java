package com.Lslen.repository;

import com.Lslen.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<user, Integer> {
    Optional<user> findByUsername(String username);
    boolean existsByEmail(String email);
}
