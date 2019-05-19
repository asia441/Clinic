//package com.example.Clinic.model;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@NoArgsConstructor
//@Data
//public class Clinic {
//
//    @Id
//    private Long clinicId;
//    @OneToOne
//
//    private Address address;
//    @OneToMany
//    @JoinColumn(name = "office_id")
//    private List<Office> officeList = new ArrayList<>();
//    @OneToMany
//    private List<Visit> visitList = new ArrayList<>();
//    @OneToMany
//    private List<Doctor> doctorList = new ArrayList<>();
//    @OneToMany
//    private List<Patient> patientList = new ArrayList<>();
//    @OneToMany
//    private List<Administator> administatorList = new ArrayList<>();
//

//
//}
