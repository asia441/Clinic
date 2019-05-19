package com.example.Clinic.repository;

import com.example.Clinic.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {



}
