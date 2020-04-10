package com.addcustomer.addcustomer.repostitories;

import com.addcustomer.addcustomer.entity.CustomerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface customerRepository extends JpaRepository<CustomerEntity,Integer> {

    List<CustomerEntity> findByNameCustomerContaining(String name);
    Page<CustomerEntity> findByNameCustomerContaining(String name, Pageable pageable);


}
