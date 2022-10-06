package com.ashokit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Integer id;
	private String  name;
	private Integer age;
	private String adress;
	private  Double salary;
	

}
