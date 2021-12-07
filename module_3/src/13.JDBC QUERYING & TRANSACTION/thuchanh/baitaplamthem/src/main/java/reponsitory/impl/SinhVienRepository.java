package reponsitory.impl;

import model.SinhVien;
import reponsitory.ISinhVienRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienRepository implements ISinhVienRepository {
    public static Connection connection;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/sinhVien";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "levanlanh180299";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SinhVien> finedAll() {
        List<SinhVien> sinhVienList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from sinhVien");

            SinhVien sinhVien = null;
            while (resultSet.next()){
                sinhVien = new SinhVien();
                sinhVien.setId(resultSet.getInt("id"));
                sinhVien.setHoTen(resultSet.getString("hoTen"));
                sinhVien.setGioiTinh(resultSet.getString("gioiTinh"));
                sinhVien.setTuoi(resultSet.getInt("tuoi"));
                sinhVien.setDiemTrungBinh(resultSet.getFloat("diemTrungBinh"));
                sinhVienList.add(sinhVien);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sinhVienList;
    }

    @Override
    public void save(SinhVien sinhVien) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into sinhVien (id,hoTen,gioiTinh,tuoi,die,TrungBinh)");
            preparedStatement.setString(1, String.valueOf(sinhVien.getId()));
            preparedStatement.setString(2,sinhVien.getHoTen());
            preparedStatement.setString(3,sinhVien.getGioiTinh());
            preparedStatement.setString(4, String.valueOf(sinhVien.getTuoi()));
            preparedStatement.setString(5, String.valueOf(sinhVien.getDiemTrungBinh()));
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
