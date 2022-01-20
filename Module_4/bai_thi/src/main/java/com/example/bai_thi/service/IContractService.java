package com.example.bai_thi.service;


import com.example.bai_thi.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {

    List<Contract> getAll();

    Contract findById(Integer id);

    void save(Contract contract);

    List<Contract> findByName(String name);

    void remove(Integer id);

    Page<Contract> findAll(Pageable pageable);
}
