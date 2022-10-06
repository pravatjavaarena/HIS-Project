package com.ashokit.service;

import org.springframework.stereotype.Service;

import com.ashokit.model.Employee;

@Service
public interface IEmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public Employee getEmployeeData(int id) ;
		
	
	


}
