package com.casetudy.service.customer;

import com.casetudy.model.customer.CustomerType;

public interface ICustomerTypeService {
    Iterable<CustomerType> findAll();
}
