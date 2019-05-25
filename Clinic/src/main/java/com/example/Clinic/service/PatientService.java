package com.example.Clinic.service;

import com.example.Clinic.model.Patient;
import com.example.Clinic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Component
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
    public Iterable<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> findPatientById(Long patientId) {
        return  patientRepository.findById(patientId);
    }




}
