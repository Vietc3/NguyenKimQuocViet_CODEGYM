package com.crud.crudcustomer.service;

import com.crud.crudcustomer.Models.User;
import com.crud.crudcustomer.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements userService {
    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public List<User> saveAll(List<User> entities) {
        return (List<User>)userRepository.saveAll(entities);
    }

    @Override
    public Optional<User> findById(String s) {
        return userRepository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    @Override
    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<User> findAllById(List<String> strings) {
        return (List<User>)userRepository.findAllById(strings);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(String s) {
        userRepository.deleteById(s);
    }

    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteAll(List<User> entities) {
        userRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Autowired

    UserRepository userRepository;



}
