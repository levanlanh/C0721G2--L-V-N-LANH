package repository;

import model.BenhVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BenhVienRepository implements BenhVienRepositoryImpl {

    @Override
    public List<BenhVien> findAll() {
        List<BenhVien> benhVienList = new ArrayList<>();
        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from ma_benh_nhan");
            BenhVien benhVien = null;
            while (resultSet.next()){
                benhVien = new BenhVien();
                benhVien.setMaBenhAn(resultSet.getString("ma_benh_an"));
                benhVien.setMaBenhNhan(resultSet.getString("ma_benh_nhan"));
                benhVien.setTenBenhNhan(resultSet.getString("ten_benh_nhan"));
                benhVien.setNgayNhapVien(resultSet.getString("ngay_nhap_vien"));
                benhVien.setNgayRaVien(resultSet.getString("ngay_ra_vien"));
                benhVien.setLyDoNhapVien(resultSet.getString("ly_do_nhap_vien"));
                benhVienList.add(benhVien);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhVienList;
    }

    @Override
    public void save(BenhVien benhVien) {

    }

    @Override
    public void remove(String name) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement("delete from ma_benh_nhan where ma_benh_an = ? ");
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
