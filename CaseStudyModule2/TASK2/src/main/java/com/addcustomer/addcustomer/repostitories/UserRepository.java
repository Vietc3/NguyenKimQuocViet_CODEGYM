package com.addcustomer.addcustomer.repostitories;

import com.addcustomer.addcustomer.Domain.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}