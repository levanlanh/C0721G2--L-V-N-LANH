package repository;

import model.BenhVien;

import java.util.List;

public interface BenhVienRepositoryImpl {
    List<BenhVien> findAll();
    void save(BenhVien benhVien);
    void remove(String name);
    BenhVien findById(int id);
    void update(BenhVien benhVien);
    List<BenhVien> orderByName();
    List<BenhVien> search(String name, int id,String address );
}
