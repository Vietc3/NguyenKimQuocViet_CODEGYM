package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.CustomerEntity;
import org.springframework.data.domain.*;

import java.util.List;
import java.util.Optional;

public interface customerService {


    Page<CustomerEntity> findByNameCustomerContaining(String name, Pageable pageable);

    Page<CustomerEntity> findAll(Pageable pageable);

    CustomerEntity save(CustomerEntity entity);

    //
    abstract List<CustomerEntity> search(String name);

    List<CustomerEntity> saveAll(List<CustomerEntity> entities);

    Optional<CustomerEntity> findById(Integer integer);

    boolean existsById(Integer integer);

    List<CustomerEntity>  findAll();

    List<CustomerEntity>  findAllById(List<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(CustomerEntity entity);

    void deleteAll(List<CustomerEntity> entities);

    void deleteAll();
}
