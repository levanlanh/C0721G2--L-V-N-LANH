package repository.impl;

import model.User;
import repository.IUserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/demoThucHanh";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "levanlanh180299";
    public static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<User> selectAllUser() {
        List<User> userList = new ArrayList<>();
        try {
            Statement statement = UserRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            User user = null;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public User selectUser(int id) {
        User user = new User();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = UserRepository.connection.prepareStatement("select  * from users where id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(name,email,country);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public void insertUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into users (name,email,country) values (?,?,?)");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("update users set `name` = ?,email= ?, country =? where Id = ?;");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("delete from users where id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<User> orderByName() {
        return null;
    }

    @Override
    public List<User> selectByCountry(String countryName) {
        return null;
    }
}
