package casetudy_module2.services.contract;

import casetudy_module2.services.Services;

public interface ContractService extends Services {
    @Override
    void add();

    @Override
    void show();

    @Override
    void edit();
}
