package com.demo.service;


import com.demo.model.Customer;
import com.demo.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface ICustomerService extends IGeneralService<Customer> {

    Page<Customer> findAll(Pageable pageable);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname,Pageable pageable);
}
