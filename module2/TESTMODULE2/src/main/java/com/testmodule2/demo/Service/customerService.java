package com.testmodule2.demo.Service;


import com.testmodule2.demo.Entity.CustomerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface customerService {


    Page<CustomerEntity> findByTenHangContaining(String name, Pageable pageable);

    Page<CustomerEntity> findAll(Pageable pageable);

    CustomerEntity save(CustomerEntity entity);

    //
    List<CustomerEntity> search(String name);

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
