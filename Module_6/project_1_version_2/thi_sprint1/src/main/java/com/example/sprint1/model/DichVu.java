package com.example.sprint1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idKhacHang;
    private String tenKhachHang;
    private String maDichVu;
    private String maSanPham;
    private String tenSanPham;
    private Integer soLuong;
    private String ngayDatDichVu;
    private Double tongTien;
}
