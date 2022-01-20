package com.casetudy.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Integer positionId;
    @Column(name = "position_name")
    private String positionName;

    @OneToMany(targetEntity = Employee.class, mappedBy = "position")
    private List<Employee> employees;

    public Position() {
    }

    public Position(Integer positionId, String positionName, List<Employee> employees) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employees = employees;
    }


    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
