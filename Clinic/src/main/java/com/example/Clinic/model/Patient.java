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


    @ManyToMany
    @JoinTable(
            name = "PATIENT_DOCTOR",
            inverseJoinColumns = {@JoinColumn(name = "patient_id")},
            joinColumns = {@JoinColumn(name = "doctor_id")})
    private List <Doctor> doctorList;
    private String pesel;

    @OneToOne
    private Address address;
//    @OneToMany
//    private List<Visit> visitsList = new ArrayList<>();


    @Override
    public void logIn() {
        super.logIn();
    }

    @Override
    public void logOut() {
        super.logOut();
    }

    @Override
    public List<Doctor> ShowAllDoctors() {
        return super.ShowAllDoctors();
    }

    @Override
    public void showDoctorSchedule() {
        super.showDoctorSchedule();
    }

    public void SignIn() {}

    public void setOwnVisit() {}
}
