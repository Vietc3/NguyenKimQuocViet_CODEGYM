package com.addcustomer.addcustomer.entity;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "type_services")

public class idTypeService {

       @Id
        @Column(name = "type_service_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "type_services_name")
        private String type_services_name;

        @OneToMany(targetEntity = ServiceEntity.class)
        private List<ServiceEntity> services;


        public List<ServiceEntity> getServices() {
            return services;
        }

        public void setServices(List<ServiceEntity> services) {
            this.services = services;
        }

        public void idTypeService() {

        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public String getType_services_name() {
            return type_services_name;
        }

        public void setType_services_name(String type_services_name) {
            this.type_services_name = type_services_name;
        }
    }

