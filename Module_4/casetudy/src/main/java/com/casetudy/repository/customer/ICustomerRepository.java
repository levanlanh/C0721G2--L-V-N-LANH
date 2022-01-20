package com.casetudy.repository.customer;

import com.casetudy.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value="select * from customer where customer.customer_name like concat('%',?1,'%')",nativeQuery = true)
    List<Customer> findByName(String name);


}
