package com.casetudy.service.employee.impl;

import com.casetudy.model.employee.Division;
import com.casetudy.repository.employee.IDivisionRepository;
import com.casetudy.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
