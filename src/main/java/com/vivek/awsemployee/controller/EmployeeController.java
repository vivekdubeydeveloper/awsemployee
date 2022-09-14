package com.vivek.awsemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.awsemployee.model.Employee;
import com.vivek.awsemployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		return employeeService.getEmployee();
	}

}
