package com.example.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pagination.model.Helper;

@Repository
public interface HelperRepo extends JpaRepository<Helper, Integer> {
    Page<Helper> findAll(Pageable pageable);
}
