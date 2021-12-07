package service;

import model.SinhVien;

import java.util.List;

public interface ISinhVienService {
    List<SinhVien> finedAll ();
    void save(SinhVien user);
    void remove(int id);
    SinhVien findById(String hoTen);
    void update(SinhVien sinhVien);
    List<SinhVien> findByCountry(String country);
    List<SinhVien> sortByDiemTrungBinh();
}
