package com.example.t2010aorder.repository;

import com.example.t2010aorder.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>, JpaSpecificationExecutor<OrderDetail> {
}
