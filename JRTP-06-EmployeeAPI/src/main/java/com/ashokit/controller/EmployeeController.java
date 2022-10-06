package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.Employee;
import com.ashokit.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<Employee>  saveEmployee(@RequestBody Employee emp){
		
		Employee emp1=service.saveEmployee(emp);
		return new ResponseEntity<Employee>(emp1,HttpStatus.CREATED);
			
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
		
		Employee employee=service.getEmployeeData(id);
		return new ResponseEntity<Employee> (employee,HttpStatus.OK);
		
	}
	
}
