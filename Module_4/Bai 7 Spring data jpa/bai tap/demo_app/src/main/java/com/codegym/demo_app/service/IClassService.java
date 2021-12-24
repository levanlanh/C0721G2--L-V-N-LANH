package com.codegym.demo_app.service;



import com.codegym.demo_app.model.ClassRoom;

import java.util.List;

public interface IClassService {
    List<ClassRoom> findAll();
}
