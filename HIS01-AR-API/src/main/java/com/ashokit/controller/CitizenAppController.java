package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.CitizenApp;
import com.ashokit.service.IArService;

@RestController
@RequestMapping("/citizen")
public class CitizenAppController {
	
	@Autowired
	private IArService service;
	
	 @PostMapping("/data")
	 public ResponseEntity<String> createCitizenApp(@RequestBody CitizenApp citizen){
		 
		 
	           Integer id=service.createApplication(citizen);
	           if(id>0) {
	        	   
	        	   return new ResponseEntity<String>(id+"account created sucessfully",HttpStatus.OK);
	           }
	           else {
	        	   
	        	   return new ResponseEntity<String>("Invalid ssn number",HttpStatus.BAD_REQUEST);
	           }
		  
		 
		 
	 }

}
