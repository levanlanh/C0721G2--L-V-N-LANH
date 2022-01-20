package com.casetudy.service.employee.impl;

import com.casetudy.model.employee.EducationDegree;
import com.casetudy.repository.employee.IEducationDegreeRepository;
import com.casetudy.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
