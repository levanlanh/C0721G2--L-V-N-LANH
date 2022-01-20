package com.casetudy.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Integer educationId;
    @Column(name = "education_name")
    private String educationName;

    public EducationDegree() {
    }

    public EducationDegree(Integer educationId, String educationName, List<Employee> employees) {
        this.educationId = educationId;
        this.educationName = educationName;
        this.employees = employees;
    }

    @OneToMany(targetEntity = Employee.class,mappedBy = "educationDegree")
    private List<Employee> employees;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}