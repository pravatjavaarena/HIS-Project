package com.ashokit.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ChildrenDetail {
	
	
	private Integer caseNum;
	private  String  childName;
	private Integer childAge;
	private Integer ssn;
	private LocalDate dob;
}
