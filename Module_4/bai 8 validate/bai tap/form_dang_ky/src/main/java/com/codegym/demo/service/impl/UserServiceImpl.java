package com.codegym.demo.service.impl;

import com.codegym.demo.dto.FormDto;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.IUserRepository;
import com.codegym.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public void save(FormDto formDto) {
        User user = new User(formDto.getId(),formDto.getFirstName(),formDto.getLastName(),
                formDto.getPhoneNumber(),formDto.getAge(),formDto.getEmail());
        iUserRepository.save(user);
    }
}
