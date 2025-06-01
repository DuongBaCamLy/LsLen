package com.Lslen.repository;

import com.Lslen.entity.contactMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactMessageRepository extends JpaRepository<contactMessage, Integer> {
}
