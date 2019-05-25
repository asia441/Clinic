package com.example.Clinic.service;


import com.example.Clinic.model.Visit;
import com.example.Clinic.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;

    public Visit save(Visit visit){
        return visitRepository.save(visit);
    }
    public Iterable<Visit> findAllVisits() {
        return visitRepository.findAll();
    }

    public Optional<Visit> findVisitById(Long visitId) {
        return  visitRepository.findById(visitId);
    }


}
