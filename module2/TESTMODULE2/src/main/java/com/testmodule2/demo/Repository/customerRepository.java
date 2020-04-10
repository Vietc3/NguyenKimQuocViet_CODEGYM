package com.testmodule2.demo.Repository;


import com.testmodule2.demo.Entity.CustomerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface customerRepository extends JpaRepository<CustomerEntity,Integer> {

    List<CustomerEntity> findByTenHangContaining(String name);
    Page<CustomerEntity> findByTenHangContaining(String name, Pageable pageable);


}
