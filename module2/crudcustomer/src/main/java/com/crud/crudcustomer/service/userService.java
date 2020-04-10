package com.crud.crudcustomer.service;

import com.crud.crudcustomer.Models.User;

import java.util.List;
import java.util.Optional;

public interface userService {
    User save(User entity);


    List<User> saveAll(List<User> entities);

    Optional<User> findById(String s);

    boolean existsById(String s);

    List<User> findAll();

    List<User> findAllById(List<String> strings);

    long count();

    void deleteById(String s);

    void delete(User entity);

    void deleteAll(List<User> entities);

    void deleteAll();
}
