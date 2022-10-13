package com.ashokit.binding;

import java.util.Date;

import lombok.Data;

@Data
public class CitizenApp {
	
	private  String fullname;
	private String email;
	private Long mobile;
	private String gender;
	private Date  dob;
	private Long ssn;

}
