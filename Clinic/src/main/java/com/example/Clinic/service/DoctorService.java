package com.example.Clinic.service;

import com.example.Clinic.model.Doctor;
import com.example.Clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public Iterable<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> findById(Long patientId) {
        return  doctorRepository.findById(patientId);
    }
}
