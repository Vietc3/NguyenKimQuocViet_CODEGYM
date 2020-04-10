package com.testmodule2.demo.Service;


import com.testmodule2.demo.Entity.CustomerEntity;
import com.testmodule2.demo.Repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class customerServiceImp implements customerService {
    @Override
    public Page<CustomerEntity> findByTenHangContaining(String name, Pageable pageable) {
        return customerRepository.findByTenHangContaining(name, pageable);
    }

    @Override
    public Page<CustomerEntity> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public CustomerEntity save(CustomerEntity entity) {
        return customerRepository.save(entity);
    }
    //
    @Override
    public List<CustomerEntity> search(String name) {
        return customerRepository.findByTenHangContaining(name);
    }

    @Override
    public List<CustomerEntity> saveAll(List<CustomerEntity> entities) {
        return (List<CustomerEntity> )customerRepository.saveAll(entities);
    }

    @Override
    public Optional<CustomerEntity> findById(Integer integer) {
        return customerRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return customerRepository.existsById(integer);
    }

    @Override
    public List<CustomerEntity>  findAll() {
        return (List<CustomerEntity> )customerRepository.findAll();
    }

    @Override
    public List<CustomerEntity>  findAllById(List<Integer> integers) {
        return (List<CustomerEntity>)customerRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return customerRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        customerRepository.deleteById(integer);
    }

    @Override
    public void delete(CustomerEntity entity) {
        customerRepository.delete(entity);
    }

    @Override
    public void deleteAll(List<CustomerEntity> entities) {
        customerRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }

    @Autowired
    customerRepository customerRepository;
}