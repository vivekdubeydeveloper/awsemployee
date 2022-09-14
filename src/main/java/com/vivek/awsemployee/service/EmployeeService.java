package com.vivek.awsemployee.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vivek.awsemployee.model.Employee;

@Service
public class EmployeeService {

	public List<Employee> getEmployee() {

		return Arrays.asList(new Employee(1, "Vivek", 5000), new Employee(2, "Pankaj", 8000),
				new Employee(3, "Mahendra", 5000),new Employee(4, "Mahi", 15000),new Employee(5, "sachin", 17000));
	}

}
