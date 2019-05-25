package com.example.Clinic.repository;

import com.example.Clinic.model.Doctor;
import org.springframework.data.repository.CrudRepository;


public interface DoctorRepository extends CrudRepository <Doctor, Long> {

}