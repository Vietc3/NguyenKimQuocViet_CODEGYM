package com.addcustomer.addcustomer.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "khachhang")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDKhachHang", nullable = false, length = 50)
    private Integer idCustomer;

    @Column(name = "SoCMND", length = 50)
    private String passportCustomer;

    @Column(name = "IDLoaiKhach", length = 50)
    private Integer idTypeCustomer;

    @Column(name = "NgaySinh", length = 50)

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dayOfBirthCustomer;

    @NotEmpty
    @Column(name = "SDT", length = 50)
    private String numberCustomer;

    @Column(name = "Email", length = 50)
    private String emailCustomer;

    @Column(name = "DiaChi", length = 50)
    private String addressCustomer;

    @NotEmpty
    @Column(name = "HoVaTen", length = 50)
    private String nameCustomer;


    public CustomerEntity() {
    }

    public CustomerEntity(Integer idCustomer, Integer idTypeCustomer, Date dayOfBirthCustomer, String passportCustomer,
                          String numberCustomer, String emailCustomer, String addressCustomer, String nameCustomer) {
        this.idCustomer = idCustomer;
        this.idTypeCustomer = idTypeCustomer;
        this.dayOfBirthCustomer = dayOfBirthCustomer;
        this.passportCustomer = passportCustomer;
        this.numberCustomer = numberCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.nameCustomer = nameCustomer;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(Integer idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public Date getDayOfBirthCustomer() {
        return dayOfBirthCustomer;
    }

    public void setDayOfBirthCustomer(Date dayOfBirthCustomer) {
        this.dayOfBirthCustomer = dayOfBirthCustomer;
    }

    public String getPassportCustomer() {
        return passportCustomer;
    }

    public void setPassportCustomer(String passportCustomer) {
        this.passportCustomer = passportCustomer;
    }

    public String getNumberCustomer() {
        return numberCustomer;
    }

    public void setNumberCustomer(String numberCustomer) {
        this.numberCustomer = numberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
}
