package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee save(Employee employee);
	
	

}
