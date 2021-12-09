package repository.impl;

import model.Customer;
import repository.ICustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customer");
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(Integer.parseInt(resultSet.getString("customer_id")));
                customer.setCustomerTypeId(Integer.parseInt(resultSet.getString("customer_type_id")));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("birthday"));
                customer.setGender(resultSet.getString("gender"));
                customer.setIdCard(resultSet.getString("id_card"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.connection.prepareStatement
                    ("insert into customer(customer_id,customer_type_id,customer_name,birthday,gender,id_card,phone,email,address)" + " values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, customer.getCustomerId());
            preparedStatement.setInt(2, customer.getCustomerTypeId());
            preparedStatement.setString(3, customer.getCustomerName());
            preparedStatement.setString(4, customer.getBirthday());
            preparedStatement.setString(5, customer.getGender());
            preparedStatement.setString(6, customer.getIdCard());
            preparedStatement.setString(7, customer.getPhone());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement("delete  from customer where customer_id = ? ");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.connection.prepareStatement("select * from customer where customer_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(Integer.parseInt(resultSet.getString("customer_id")));
                customer.setCustomerTypeId(Integer.parseInt(resultSet.getString("customer_type_id")));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("birthday"));
                customer.setGender(resultSet.getString("gender"));
                customer.setIdCard(resultSet.getString("id_card"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                // cách 2 :
//                int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
//                String customerName = resultSet.getString("customer_name");
//                String birthday = resultSet.getString("birthday");
//                String gender = resultSet.getString("gender");
//                String idCard = resultSet.getString("id_card");
//                String phone = resultSet.getString("phone");
//                String email = resultSet.getString("email");
//                String address = resultSet.getString("address");
//                customer = new Customer(id,customerTypeId,customerName,birthday,gender,idCard,phone,email,address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void update(Customer customer) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement
                    ("update  customer set  customer_type_id = ? ,customer_name = ?, birthday = ?," +
                            "gender= ?,id_card = ?,phone = ? ,email=?,address=? where customer_id=? ");
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getCustomerId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> orderByName() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement
                    ("select  * from customer order by customer_name");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("birthday"));
                customer.setGender(resultSet.getString("gender"));
                customer.setIdCard(resultSet.getString("id_card"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<Customer> search(String name, int id, String address) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement
                    ("select  * from customer where customer_name like ? and customer_id = ? and address = ? ");
            preparedStatement.setString(1, "%"+name+"%");
            preparedStatement.setInt(2, id);
            preparedStatement.setString(3, address);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("birthday"));
                customer.setGender(resultSet.getString("gender"));
                customer.setIdCard(resultSet.getString("id_card"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }




}
