package repository.impl;

import model.Customer;
import model.Employee;
import repository.IEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from  employee");
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setEmployeeName(resultSet.getString("employee_name"));
                employee.setPositionId(resultSet.getInt("position_id"));
                employee.setDegreeId(resultSet.getInt("degree_id"));
                employee.setDivisionId(resultSet.getInt("division_id"));
                employee.setBirthday(resultSet.getString("birthday"));
                employee.setIdCard(resultSet.getString("id_card"));
                employee.setSalary(resultSet.getString("salary"));
                employee.setPhone(resultSet.getString("phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
                employeeList.add(employee);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.connection.prepareStatement
                    ("insert into employee(employee_id,employee_name,position_id,degree_id,division_id,birthday,id_card,salary,phone,email,address)" +
                            " values (?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, employee.getEmployeeId());
            preparedStatement.setString(2, employee.getEmployeeName());
            preparedStatement.setInt(3, employee.getPositionId());
            preparedStatement.setInt(4, employee.getDegreeId());
            preparedStatement.setInt(5, employee.getDivisionId());
            preparedStatement.setString(6, employee.getBirthday());
            preparedStatement.setString(7, employee.getIdCard());
            preparedStatement.setString(8, employee.getSalary());
            preparedStatement.setString(9, employee.getPhone());
            preparedStatement.setString(10, employee.getEmail());
            preparedStatement.setString(11, employee.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement
                    ("delete  from employee where employee_id = ?  ");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Employee employee = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.connection.prepareStatement("select  * from employee where employee_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                employee = new Employee();
                employee.setEmployeeId(Integer.parseInt(resultSet.getString("employee_id")));
                employee.setEmployeeName(resultSet.getString("employee_name"));
                employee.setPositionId(Integer.parseInt(resultSet.getString("position_id")));
                employee.setDegreeId(Integer.parseInt(resultSet.getString("degree_id")));
                employee.setDivisionId(Integer.parseInt(resultSet.getString("division_id")));
                employee.setBirthday(resultSet.getString("birthday"));
                employee.setIdCard(resultSet.getString("id_card"));
                employee.setSalary(resultSet.getString("salary"));
                employee.setPhone(resultSet.getString("phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Employee employee) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement
                    ("update employee set employee_name = ?, position_id = ? ,degree_id = ?, division_id = ?," +
                            " birthday = ?,id_card= ?,salary = ?, phone = ?,email = ? ,address = ? where employee_id = ? ");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Employee> orderByName() {
        return null;
    }

    @Override
    public List<Employee> search(String name, int id, String address) {
        return null;
    }
}
