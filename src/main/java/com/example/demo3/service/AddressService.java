package com.example.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Address;
import com.example.demo3.repository.AddressRepository;
import com.example.demo3.repository.EmployeeRepository;

@Service
public class AddressService {
@Autowired
private AddressRepository addressRepository;

public Address AddAddress (Address address) {
	Address addressSaveToDB = this.addressRepository.save(address);
	return addressSaveToDB;
	}

}
