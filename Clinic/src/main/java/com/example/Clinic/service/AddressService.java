package com.example.Clinic.service;


import com.example.Clinic.model.Address;
import com.example.Clinic.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress (Address address){
        return addressRepository.save(address);
    }
    public Iterable<Address> findAllAddress() {
        return addressRepository.findAll();
    }

    public Optional<Address> findAddressById(Long addressId) {
        return  addressRepository.findById(addressId);
    }


}
