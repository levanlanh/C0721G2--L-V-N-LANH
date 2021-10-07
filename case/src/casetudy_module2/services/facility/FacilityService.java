package casetudy_module2.services.facility;

import casetudy_module2.services.Services;

public interface FacilityService extends Services {
    @Override
    void add();

    @Override
    void show();

    @Override
    void edit();
}
