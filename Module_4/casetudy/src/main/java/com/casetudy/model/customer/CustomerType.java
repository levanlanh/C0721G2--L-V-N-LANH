package com.casetudy.model.customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id")
    private Integer customerTypeId;
    @Column(name = "type_name")
    private String name;

    @OneToMany(targetEntity = Customer.class, mappedBy = "customerType",cascade = CascadeType.ALL)
    private List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(Integer id, String name, List<Customer> customers) {
        this.customerTypeId = id;
        this.name = name;
        this.customers = customers;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer id) {
        this.customerTypeId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
