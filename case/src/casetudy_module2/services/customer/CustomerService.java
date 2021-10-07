package casetudy_module2.services.customer;

import casetudy_module2.services.Services;

public interface CustomerService extends Services {
    @Override
    void add();

    @Override
    void show();

    @Override
    void edit();
}
