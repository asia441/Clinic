package com.example.Clinic.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Administator extends User {

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

    public Patient showPatientData(Patient patient) {
        return null;
    }

    public List<Office> showOffices() {
        List<Office> officesList = new ArrayList<>();
        return officesList;
    }

    public void assignDoctorToOffice(Doctor doctor) {}

    public void setScheduleForDoctor() {}

    public void setVisitForPatient() {}
}
