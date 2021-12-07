package service.impl;

import model.SinhVien;
import reponsitory.ISinhVienRepository;
import reponsitory.impl.SinhVienRepository;
import service.ISinhVienService;

import java.util.List;

public class SinhVienService implements ISinhVienService {
ISinhVienRepository iSinhVienRepository = new SinhVienRepository();
    @Override
    public List<SinhVien> finedAll() {
        return this.iSinhVienRepository.finedAll();
    }

    @Override
    public void save(SinhVien sinhVien) {
    this.iSinhVienRepository.save(sinhVien);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public SinhVien findById(String hoTen) {
        return null;
    }

    @Override
    public void update(SinhVien sinhVien) {

    }

    @Override
    public List<SinhVien> findByCountry(String country) {
        return null;
    }

    @Override
    public List<SinhVien> sortByDiemTrungBinh() {
        return null;
    }
}
