package com.example.bai_thi.service.impl;



import com.example.bai_thi.model.Contract;
import com.example.bai_thi.repository.IContractRepository;
import com.example.bai_thi.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository iContractRepository;


    @Override
    public List<Contract> getAll() {
        return iContractRepository.findAll();
    }

    @Override
    public Contract findById(Integer id) {
        return iContractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public List<Contract> findByName(String name) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }
}
