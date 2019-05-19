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
public class Patient extends User{

//    private String name;
//    private String surname;
//    private String phoneNumber;
//    private String email;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long patientId;
    @ManyToMany
    @JoinTable(
            name = "PATIENT_DOCTOR",
            inverseJoinColumns = {@JoinColumn(name = "patient_id")},
            joinColumns = {@JoinColumn(name = "doctor_id")})
    private Set <Doctor> doctorList;
    private String pesel;

    @OneToOne
    private Address address;
//    @OneToMany
//    private List<Visit> visitsList = new ArrayList<>();


}
