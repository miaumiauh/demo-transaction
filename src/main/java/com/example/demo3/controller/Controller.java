package com.example.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.model.Employee;
import com.example.demo3.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class Controller {
@Autowired
private EmployeeService employeeService;

@PostMapping("/add")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
throws Exception{
	Employee employeeSavedToBD = this.employeeService.addEmployee(employee);
	return new ResponseEntity<Employee>(employeeSavedToBD, HttpStatus.CREATED);
}
}
