package com.casetudy.service.employee.impl;

import com.casetudy.model.employee.Position;
import com.casetudy.repository.employee.IPositionRepository;
import com.casetudy.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
