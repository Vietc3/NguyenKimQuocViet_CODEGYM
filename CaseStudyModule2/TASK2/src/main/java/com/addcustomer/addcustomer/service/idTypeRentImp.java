package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.idTypeRent;
import com.addcustomer.addcustomer.repostitories.idTypeRentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class idTypeRentImp implements idTypeRentService {
    @Autowired
    idTypeRentReponsitory iDTypeRentReponsitory;


    @Override
    public Iterable<idTypeRent> findAll() {
        return iDTypeRentReponsitory.findAll();
    }
}
