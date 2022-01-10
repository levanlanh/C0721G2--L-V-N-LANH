package com.casetudy.model.customer;


import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_birthday")
    private String customerBirthday;
    @Column(name = "customer_gender")
    private String customerGender;
    @Column(name = "customer_id_card")
    private String customerIdCard;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_address")
    private String customerAddress;


    @ManyToOne
    @JoinColumn(name="customer_type_id" )
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerBirthday='" + customerBirthday + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", customerIdCard='" + customerIdCard + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerType=" + customerType +
                '}';
    }}
