package com.example.Clinic.service;


import com.example.Clinic.model.Office;
import com.example.Clinic.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    public Office saveOffice(Office office){
        return officeRepository.save(office);
    }
    public Iterable<Office> findAllOffices() {
        return officeRepository.findAll();
    }

    public Optional<Office> findOfficeById(Long officeId) {
        return  officeRepository.findById(officeId);
    }
}
