package com.addcustomer.addcustomer.repostitories;

import com.addcustomer.addcustomer.entity.CustomerEntity;
import com.addcustomer.addcustomer.entity.ServiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface serviceReponsitory extends JpaRepository<ServiceEntity,Long> {
    List<ServiceEntity> findByServiceNameContaining(String name);
    Page<ServiceEntity> findByServiceNameContaining(String name, Pageable pageable);
}
