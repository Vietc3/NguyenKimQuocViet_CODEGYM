package com.addcustomer.addcustomer.entity;


import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Optional;

@Entity
@Table(name = "dichvu")
public class ServiceEntity {
   @Id
    @Column(name = "service_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "service_status")
    private String service_status;
    @Column(name = "are_used")
    private int area_used;

    @Column(name = "number_floors")
    private int number_floors;

    @Column(name = "max_people")
    private int number_max_people;

    @Column(name = "rental_costs")
    private Double rental_costs;
    @ManyToOne
    @JoinColumn(name = "type_rent_id")
    private idTypeRent typeRent;
    @ManyToOne
    @JoinColumn(name = "type_service_id")
    private idTypeService typeServices;


    public idTypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(idTypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public idTypeService getTypeServices() {
        return typeServices;
    }

    public void setTypeServices(idTypeService typeServices) {
        this.typeServices = typeServices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getService_status() {
        return service_status;
    }

    public void setService_status(String service_status) {
        this.service_status = service_status;
    }

    public int getArea_used() {
        return area_used;
    }

    public void setArea_used(int area_used) {
        this.area_used = area_used;
    }

    public int getNumber_floors() {
        return number_floors;
    }

    public void setNumber_floors(int number_floors) {
        this.number_floors = number_floors;
    }

    public int getNumber_max_people() {
        return number_max_people;
    }

    public void setNumber_max_people(int number_max_people) {
        this.number_max_people = number_max_people;
    }

    public Double getRental_costs() {
        return rental_costs;
    }

    public void setRental_costs(Double rental_costs) {
        this.rental_costs = rental_costs;
    }


    public ServiceEntity(Long id, String serviceName, String service_status, int area_used, int number_floors
            , int number_max_people, Double rental_costs, idTypeRent typeRent, idTypeService typeServices) {
        this.id = id;
        this.serviceName = serviceName;
        this.service_status = service_status;
        this.area_used = area_used;
        this.number_floors = number_floors;
        this.number_max_people = number_max_people;
        this.rental_costs = rental_costs;
        this.typeRent = typeRent;
        this.typeServices = typeServices;
    }

    public ServiceEntity() {
    }
}