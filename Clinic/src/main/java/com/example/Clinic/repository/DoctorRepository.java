package com.example.Clinic.repository;

import com.example.Clinic.model.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface DoctorRepository extends CrudRepository <Doctor, Long> {



}