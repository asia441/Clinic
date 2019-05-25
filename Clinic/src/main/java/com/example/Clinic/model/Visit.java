package com.example.Clinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity

public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visitId;
    private LocalDateTime visitDateAndTime;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;



}
