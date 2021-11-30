package Service;

import Model.SanPham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SanPhamServiceImpl implements SanPhamService {
    private static Map<Integer, SanPham> sanPhamMap ;
    static {
        sanPhamMap = new HashMap<>();
        sanPhamMap.put(1,new SanPham(1,"tivi",344444,"tốt","nhật bản"));
        sanPhamMap.put(1,new SanPham(2,"máy giặt",99849,"tốt","nhật bản"));
        sanPhamMap.put(1,new SanPham(3,"laptop",34440000,"tốt","việt nam"));
        sanPhamMap.put(1,new SanPham(4,"điều hòa",34987644,"tốt","lào"));
        sanPhamMap.put(1,new SanPham(5,"điện thoại",3666664,"tốt","trung quốc"));
    }

    @Override
    public List<SanPham> findAll() {
        return new ArrayList<>(sanPhamMap.values());
    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public SanPham findByName(String name) {
        return null;
    }

    @Override
    public SanPham findById(int id) {
        return null;
    }

    @Override
    public void remove(String name) {

    }
}
