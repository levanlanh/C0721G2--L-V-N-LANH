package com.casetudy.model.employee;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    @NotBlank(message = "input your name")
    private String employeeName;

    @Column(name = "employee_birthday")
    @NotBlank(message = "input your birthday")
    private String employeeBirthday;

    @Column(name = "employee_id_card")
    @NotBlank(message = "input your id card")
    @Pattern(regexp = "(^\\d{9}$)||(^\\d{12}$)", message = "Not valid ex: xxxxxxxxx or xxxxxxxxxxxx with x is a number")
    private String employeeIdCard;

    @Column(name = "employee_salary")
    @NotNull(message = "input your salary")
    private double employeeSalary;

    @Column(name = "employee_email")
    @NotBlank(message = "input your email")
    @Pattern(regexp = "[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)")
    private String employeeEmail;

    @Column(name = "employee_address")
    @NotBlank(message = "input your address")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = " education_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

//    @OneToOne
//    @JoinColumn(name = "username",referencedColumnName = "username")
//    private User user;

    public Employee(Integer employeeId, String employeeName, String employeeBirthday, String employeeIdCard,
                    double employeeSalary, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
    }

    public Employee() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeID) {
        this.employeeId = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User username) {
//        this.user = username;
//    }
}
