package com.casetudy.model.customer;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    @Column(name = "customer_name")
    @NotBlank(message = "input your name")
    private String customerName;

    @Column(name = "customer_birthday")
    @NotBlank(message = "input your birth day")
    private String customerBirthday;

    @Column(name = "customer_gender")
    private String customerGender;

    @Column(name = "customer_id_card")
    @NotBlank(message = "input your id card")
    @Pattern(regexp = "(^\\d{9}$)||(^\\d{12}$)", message = "Not valid ex: xxxxxxxxx or xxxxxxxxxxxx with x is a number")
    private String customerIdCard;

    @Column(name = "customer_phone")
    @NotBlank(message = "input your phone")
    @Pattern(regexp = "(^09[01]\\d{7}$)")
    private String customerPhone;

    @Column(name = "customer_email")
    @NotBlank(message = "input your email")
    @Pattern(regexp = "[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)")
    private String customerEmail;
    @Column(name = "customer_address")
    @NotBlank(message = "input your address")
    private String customerAddress;


    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(Integer id, String customerName, String customerBirthday, String customerGender, String customerIdCard,
                    String customerPhone, String customerEmail, String customerAddress, CustomerType customerType) {
        this.id = id;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer customerId) {
        this.id = customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;

    }

}
