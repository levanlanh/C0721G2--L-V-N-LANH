package com.codegym.repository.impl;

import com.codegym.model.SanPham;
import com.codegym.repository.ISanPhamRepository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SanPhamRepository implements ISanPhamRepository {

   private static final Map<Integer,SanPham> sanPhams;
    static {
        sanPhams = new HashMap<>();
        sanPhams.put(1,new SanPham(1,"Honda",3000000,"xe tốt","việt nam"));
        sanPhams.put(2,new SanPham(2,"Yamaha",56000000,"xe tốt","nhật"));
        sanPhams.put(3,new SanPham(3,"Suzuki",8000000,"xe tốt","hàn quốc"));
        sanPhams.put(4,new SanPham(4,"Huyndai",45000000,"xe tốt","mỹ"));
        sanPhams.put(5,new SanPham(5,"Toyota",3600000,"xe tốt","trung quốc"));
    }


    @Override
    public List<SanPham> findAll() {
        return new ArrayList<>(sanPhams.values());
    }

    @Override
    public void save(SanPham sanPham) {

    }

    @Override
    public SanPham findById(int id) {
        return null;
    }

    @Override
    public void update(int id, SanPham sanPham) {

    }

    @Override
    public void remove(int id) {

    }
}
