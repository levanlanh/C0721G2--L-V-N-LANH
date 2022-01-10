package com.casetudy.service.customer.impl;

import com.casetudy.model.customer.CustomerType;
import com.casetudy.repository.customer.ICustomerTypeRepository;
import com.casetudy.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;
    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
