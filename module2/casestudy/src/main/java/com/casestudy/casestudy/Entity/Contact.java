//package com.casestudy.casestudy.Entity;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Date;
//
//@Entity
//@Table(name = "khachhang")
//public class Contact {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "IDKhachHang", nullable = false)
//    private Integer id;
//
//    @NotEmpty
//    @Column(name = "IDLoaiKhach", nullable = false)
//    public Integer idLoaiKhach;
//
//    @NotEmpty
//    @Column(name = "HoVaTen", nullable = false)
//    public String name;
//
//    @NotEmpty
//    @Column(name = "SoCMTND", nullable = false)
//    public Number idCard;
//
//    @Email
//    @Column(name = "Email")
//    private String email;
//
//    @Column(name = "SDT")
//    private String phone;
//
//    @Column(name = "DiaChi")
//    private String phone;
//
//    @Column(name = "NgaySinh")
//    private Date dayOfBirth;
//
//    public Contact() {
//    }
//
//    public Contact(String name, String email, String phone,Number idCard,Integer id,Integer IDLoaiKhach,Date dayOfBirth,String DiaChi) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.dayOfBirth=dayOfBirth;
//        this.diaChi=
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//}