package com.addcustomer.addcustomer.repostitories;

import com.addcustomer.addcustomer.Domain.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}