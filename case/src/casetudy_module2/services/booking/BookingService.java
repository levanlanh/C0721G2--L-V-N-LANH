package casetudy_module2.services.booking;

import casetudy_module2.services.Services;

public interface BookingService extends Services {
    @Override
    void add();

    @Override
    void show();

    @Override
    void edit();
}
