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
//    private String name;
//    private String surname;
//    private String phoneNumber;
//    private String email;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long doctorId;
    @ManyToMany
    @JoinTable(
            name = "PATIENT_DOCTOR",
            inverseJoinColumns = {@JoinColumn(name = "doctor_id")},
            joinColumns = {@JoinColumn(name = "patient_id")})
    private Set<Patient> patientList;
    private String specialization;
//
//    @OneToMany
//    private List<Visit> visitsList = new ArrayList<>();


}
