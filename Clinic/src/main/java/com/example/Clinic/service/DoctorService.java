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

    public Doctor saveDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public Iterable<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }
    public Optional<Doctor> findDoctorById(Long doctorId) {
        return  doctorRepository.findById(doctorId);
    }




}
