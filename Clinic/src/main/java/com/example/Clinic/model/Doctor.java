package com.example.Clinic.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
public class Doctor extends User {

    @ManyToMany
    @JoinTable(
            name = "PATIENT_DOCTOR",
            inverseJoinColumns = {@JoinColumn(name = "doctor_id")},
            joinColumns = {@JoinColumn(name = "patient_id")})
    private List<Patient> patientList;
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private List<Visit> visitsList = new ArrayList<>();




}
