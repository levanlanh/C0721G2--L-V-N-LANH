package com.casetudy.service.customer;

import com.casetudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ICustomerService {


    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    Customer findById(Integer id);

    void remove(Integer id);


}
