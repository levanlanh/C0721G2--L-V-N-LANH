package Service;

import Model.SanPham;

import java.util.List;

public interface SanPhamService {

    List<SanPham> findAll();

    //thêm // cập nhật // xóa // tìm kiếm theo tên

    void save( );

    void update();

    SanPham findByName(String name);

    SanPham findById(int id);

    void remove(String name);
}
