package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.idTypeRent;
import com.addcustomer.addcustomer.entity.idTypeService;
import com.addcustomer.addcustomer.repostitories.idTypeRentReponsitory;
import com.addcustomer.addcustomer.repostitories.idTypeServiceReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class idTypeServiceImp  implements iDTypeServiceService{
    @Autowired
    idTypeServiceReponsitory idTypeServiceReponsitory;

    @Override
    public Iterable<idTypeService> findAll() {
        return idTypeServiceReponsitory.findAll();
    }
}
