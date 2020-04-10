package com.testmodule2.demo.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mathang1")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "maHang", nullable = false, length = 50)
    private Integer maHang;
    @Column(name = "tenHang", length = 50)
    private String tenHang;
    @Column(name = "loaiHang", length = 50)
    private String loaiHang;
    @Column(name = "gia", length = 50)
    private Integer gia;
    @Column(name = "soLuong", length = 50)
    private Integer soLuong;

    @Column(name = "ngayTao", length = 50)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @Column(name = "moTa", length = 50)
    private String moTa;


    public CustomerEntity() {
    }

    public CustomerEntity(Integer maHang, String tenHang, String loaiHang, Integer gia, Integer soLuong, Date ngayTao, String moTa) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ngayTao = ngayTao;
        this.moTa = moTa;
    }

    public Integer getMaHang() {
        return maHang;
    }

    public void setMaHang(Integer maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
