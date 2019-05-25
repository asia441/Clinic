package com.example.Clinic.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
//@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
@NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public void logIn() {}
    public void logOut() {}
    public List<Doctor> ShowAllDoctors() {
        List<Doctor> doctorsList = new ArrayList<>();
        return doctorsList;
    }
    public void showDoctorSchedule() {}



}
