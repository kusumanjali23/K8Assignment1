package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}

	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

}
