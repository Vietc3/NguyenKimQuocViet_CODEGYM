package com.crud.crudcustomer.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "users")
public class User {
    @Id
    @Column(name = "username",nullable = false,length = 50)
    private String userName;
    @Column(name = "password",length = 50)
    private String password;
    @Column(name = "fullname",length = 50)
    private String fullname;
    @Column(name = "age",length = 50)
    private Integer age;
    @Column(name = "gender",length = 50)
    private boolean gender;

    public User() {
    }

    public User(String userName, String password, String fullname, Integer age, boolean gender) {
        this.userName = userName;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
