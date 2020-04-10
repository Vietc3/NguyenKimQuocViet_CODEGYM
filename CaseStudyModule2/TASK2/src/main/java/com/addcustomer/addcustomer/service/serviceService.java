package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.ServiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface serviceService {

    Page<ServiceEntity> findByServiceNameContaining(String name, Pageable pageable);

    Page<ServiceEntity> findAll(Pageable pageable);

    ServiceEntity save(ServiceEntity entity);

    //
    List<ServiceEntity> search(String name);

    List<ServiceEntity> saveAll(List<ServiceEntity> entities);

    Optional<ServiceEntity> findById(Long integer);

    boolean existsById(Long integer);

    List<ServiceEntity>  findAll();

    List<ServiceEntity>  findAllById(List<Long> integers);

    long count();

    void deleteById(Long integer);

    void delete(ServiceEntity entity);

    void deleteAll(List<ServiceEntity> entities);

    void deleteAll();
}
