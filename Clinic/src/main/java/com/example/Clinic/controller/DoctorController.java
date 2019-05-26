package com.example.Clinic.controller;

import com.example.Clinic.model.Doctor;
import com.example.Clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(path = "/doctors")
public class DoctorController {


    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public Doctor addNewDoctor(@RequestBody Doctor doctor) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        return doctorService.saveDoctor(doctor);
    }

    @GetMapping(path = "/all")
    public Iterable<Doctor> getAllDoctors() {
        // This returns a JSON or XML with the users
        return doctorService.findAllDoctors();
    }

    @GetMapping("/{doctorId}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long doctorId) {
        Optional<Doctor> optionalDoctor = doctorService.findDoctorById(doctorId);

        if (optionalDoctor.isPresent()) {
            return ResponseEntity.ok(optionalDoctor.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
