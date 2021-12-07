package repository.impl;

import model.Customer;
import model.CustomerType;
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
            CustomerType customerType = null;
            while (resultSet.next()){
                customer = new Customer();
                customerType = new CustomerType();
                customer.setCustomerId(Integer.parseInt(resultSet.getString("customer_id")));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("birthday"));
                customer.setGender(resultSet.getString("gender"));
                customer.setIdCard(resultSet.getString("id_card"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                customerType.setCustomerTypeId(Integer.parseInt(resultSet.getString("customer_type_id")));
                customer.setCustomerType(customerType);
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
                            ("insert into customer(customer_id,customer_type_id,customer_name,birthday,gender,id_card,phone,email,address) values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,customer.getCustomerId());
            preparedStatement.setInt(2,customer.getCustomerType().getCustomerTypeId());
            preparedStatement.setString(3,customer.getCustomerName());
            preparedStatement.setString(4,customer.getBirthday());
            preparedStatement.setString(5,customer.getGender());
            preparedStatement.setString(6,customer.getIdCard());
            preparedStatement.setString(7,customer.getPhone());
            preparedStatement.setString(8,customer.getEmail());
            preparedStatement.setString(9,customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer employee) {

    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
