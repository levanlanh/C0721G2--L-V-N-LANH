package com.codegym.demo_app.service.impl;


import com.codegym.demo_app.model.ClassRoom;
import com.codegym.demo_app.repository.IClassRepository;
import com.codegym.demo_app.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {
    @Autowired
    private IClassRepository iClassRepository;
    @Override
    public List<ClassRoom> findAll() {
        return iClassRepository.findAll();
    }
}
