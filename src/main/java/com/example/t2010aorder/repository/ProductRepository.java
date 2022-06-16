package com.example.t2010aorder.repository;

import com.example.t2010aorder.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
    Page<Product> findByNameContaining(Pageable pageable, String name);
}
