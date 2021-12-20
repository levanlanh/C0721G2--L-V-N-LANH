package com.codegym.repository;

import com.codegym.model.SanPham;

import java.util.List;

public interface ISanPhamRepository {
    List<SanPham> findAll();

    void save(SanPham sanPham);

    SanPham findById(int id);

    void update(int id, SanPham sanPham);

    void remove(int id);
}
