package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> list1=new ArrayList<Employee>();
	@Override
	public Employee saveEmployee(Employee emp) {
		
		Employee employee=new Employee();
		employee.setId(emp.getId());
		employee.setName(emp.getName());
		employee.setAge(emp.getAge());
		employee.setAdress(emp.getAdress());
		employee.setSalary(emp.getSalary());
		list1.add(employee);
	
		return  emp;
	}

	@Override
	public Employee getEmployeeData(int id1) {
		
		
		Employee emp1=new Employee();
		emp1.setId(101);
		emp1.setName("pravat");
		emp1.setAge(23);
		emp1.setAdress("Cuttack");
		emp1.setSalary(12000.90);
		Employee emp2=new Employee();
		emp2.setId(102);
		emp2.setName("Deepak");
		emp2.setAge(25);
		emp2.setAdress("Bhubaneswar");
		emp2.setSalary(23000.90);
		Employee emp3=new Employee();
		emp3.setId(103);
		emp3.setName("Ramesh");
		emp3.setAge(34);
		emp3.setAdress("jajpur");
		emp3.setSalary(24000.00);
		
		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);
     Employee emp4=new Employee();
      for(Employee e : list1) {
    	  
    	  if(e.getId()==id1) {
    		  
    		  emp4.setId(e.getId());
    		  emp4.setName(e.getName());
    		  emp4.setAge(e.getAge());
    		  emp4.setAdress(e.getAdress());
    		  emp4.setSalary(e.getSalary());
    		   
    	  }// if
      }//for
		return emp4;
	}
	
	
	

}
