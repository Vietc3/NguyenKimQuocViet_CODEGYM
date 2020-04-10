package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.ServiceEntity;
import com.addcustomer.addcustomer.repostitories.serviceReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class serviceImp implements serviceService {
    @Override
    public Page<ServiceEntity> findByServiceNameContaining(String name, Pageable pageable) {
        return serviceReponsitory.findByServiceNameContaining(name, pageable);
    }

    @Override
    public Page<ServiceEntity> findAll(Pageable pageable) {
        return serviceReponsitory.findAll(pageable);
    }

    @Override
    public ServiceEntity save(ServiceEntity entity) {
        return (ServiceEntity) serviceReponsitory.save(entity);
    }
    //
    @Override
    public List<ServiceEntity> search(String name) {
        return serviceReponsitory.findByServiceNameContaining(name);
    }

    @Override
    public List<ServiceEntity> saveAll(List<ServiceEntity> entities) {
        return (List<ServiceEntity> )serviceReponsitory.saveAll(entities);
    }

    @Override
    public Optional<ServiceEntity> findById(Long integer) {
        return serviceReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Long integer) {
        return serviceReponsitory.existsById(integer);
    }

    @Override
    public List<ServiceEntity>  findAll() {
        return (List<ServiceEntity> )serviceReponsitory.findAll();
    }

    @Override
    public List<ServiceEntity>  findAllById(List<Long> integers) {
        return serviceReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return serviceReponsitory.count();
    }

    @Override
    public void deleteById(Long integer) {
        serviceReponsitory.deleteById(integer);
    }

    @Override
    public void delete(ServiceEntity entity) {
        serviceReponsitory.delete(entity);
    }

    @Override
    public void deleteAll(List<ServiceEntity> entities) {
        serviceReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        serviceReponsitory.deleteAll();
    }

    @Autowired
    serviceReponsitory serviceReponsitory;
}
