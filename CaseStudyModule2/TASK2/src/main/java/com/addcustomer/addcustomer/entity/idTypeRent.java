package com.addcustomer.addcustomer.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_rents")
public class idTypeRent {
       @Id
        @Column(name = "type_rent_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "type_rent_name")
        private String type_rent_name;

        @OneToMany(targetEntity = ServiceEntity.class)
        private List<ServiceEntity> services;

        public idTypeRent() {

        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public String getType_rent_name() {
            return type_rent_name;
        }

        public void setType_rent_name(String type_rent_name) {
            this.type_rent_name = type_rent_name;
        }

        public List<ServiceEntity> getServices() {
            return services;
        }

        public void setServices(List<ServiceEntity> services) {
            this.services = services;
        }
}
