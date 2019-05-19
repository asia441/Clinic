package com.example.Clinic.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Office {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long number;
    @OneToMany(mappedBy = "office")
    private List<Visit> visitsListForOffice = new ArrayList<>();
}
