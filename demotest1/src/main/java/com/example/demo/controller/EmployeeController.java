package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println("Saving user.");
		return employeeService.save(employee);
	}

	@GetMapping(value = "/get")
	public List<Employee> getAllEmployees() {
		System.out.println("Getting all users.");
		return employeeService.findAll();
	}

}
