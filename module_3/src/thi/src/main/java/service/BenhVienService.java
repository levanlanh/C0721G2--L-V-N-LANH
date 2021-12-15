package service;

import model.BenhVien;
import repository.BenhVienRepository;
import repository.BenhVienRepositoryImpl;

import java.util.List;

public class BenhVienService implements BenhVienServiceImpl {
    BenhVienRepositoryImpl benhVienRepository = new BenhVienRepository();

    @Override
    public List<BenhVien> findAll() {
        return this.benhVienRepository.findAll();
    }

    @Override
    public void save(BenhVien benhVien) {

    }

    @Override
    public void remove(String name) {
    this.benhVienRepository.remove(name);
    }

    @Override
    public BenhVien findById(int id) {
        return null;
    }

    @Override
    public void update(BenhVien benhVien) {

    }

    @Override
    public List<BenhVien> orderByName() {
        return null;
    }

    @Override
    public List<BenhVien> search(String name, int id, String address) {
        return null;
    }
}
