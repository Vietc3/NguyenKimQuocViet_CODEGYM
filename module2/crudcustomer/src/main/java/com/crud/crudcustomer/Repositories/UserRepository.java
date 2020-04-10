package com.crud.crudcustomer.Repositories;

import com.crud.crudcustomer.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
