package com.example.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Address;
import com.example.demo3.model.Employee;
import com.example.demo3.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
@Autowired
private AddressService addressService;
@Transactional
public Employee addEmployee(Employee employee) throws Exception{
	Employee employeSavedToDB = this.employeeRepository.save(employee);
	Address address = new Address();
	address.setId(123L);
	address.setAddress("varanas");
	address.setEmployee(employee);
	this.addressService.AddAddress(address);
	return employeSavedToDB;
	
}
}
