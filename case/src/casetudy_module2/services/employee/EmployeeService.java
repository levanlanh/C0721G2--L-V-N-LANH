package casetudy_module2.services.employee;

import casetudy_module2.services.Services;

public interface EmployeeService extends Services {
    @Override
    void add();

    @Override
    void show();

    @Override
    void edit();
}
