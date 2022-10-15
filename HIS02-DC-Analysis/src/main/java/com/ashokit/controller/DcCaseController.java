package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.ChildrenDetail;
import com.ashokit.binding.CitizenPlan;
import com.ashokit.binding.EducationDetail;
import com.ashokit.binding.IncomeDetail;
import com.ashokit.binding.NewChildren;
import com.ashokit.service.ISearchAppId;

@RestController
public class DcCaseController {
	
	@Autowired
	private ISearchAppId service;
	
	@GetMapping("/search/{id}")
	public ResponseEntity<String>   createCase(@PathVariable Integer id){
		
		Integer caseId= service.searchAppId(id);
		
		if(caseId !=null) 
			return new ResponseEntity<String>("Case id generate sucessfully",HttpStatus.CREATED);
		
		else
			return new ResponseEntity<String>("Invalid Application id",HttpStatus.BAD_REQUEST);
	}
	
	
	 @GetMapping("/searchPlan")
	    public ResponseEntity<List<String>>   searchPlan(){
		
		      List<String >  listPlan=service.searchPlan();
		      return new ResponseEntity<List<String>>(listPlan,HttpStatus.OK);
		      
	    
		
	   }
	 
	 @PostMapping("/citizenPaln")
	 public  ResponseEntity<String> selectPlan(@RequestBody CitizenPlan  citizenplan){
		 
		String  plan = service.planSelection(citizenplan);
		if(plan != null)
			return new ResponseEntity<String>("Citizen plan save sucessfully",HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("invalid  Case Number",HttpStatus.BAD_REQUEST);
	 }
	 @PostMapping("/income")
	 public ResponseEntity<String> saveIncomeDetails(@RequestBody IncomeDetail detail){
		 
		 String income=service.saveIncome(detail);
		 return new ResponseEntity<String>(income,HttpStatus.CREATED);
	 }

	  @PostMapping("/education")
	  public ResponseEntity<String>  saveEducation(@RequestBody EducationDetail education){
		  
		  String eduDetail=service.saveEducation(education);
		  return new ResponseEntity<String>(eduDetail,HttpStatus.CREATED);
	  }
	  
	  @PostMapping("/kid")
	  public ResponseEntity<String> saveChildren(@RequestBody ChildrenDetail child){
		  
		  String childDetail=service.saveChidren(child);
		  
		  return new ResponseEntity<String>(childDetail,HttpStatus.CREATED);
	  }
	  @PostMapping("/addKid")
	  public ResponseEntity<String> addNewKid(@RequestBody NewChildren child ){
		  
		 String childDetail= service.addChild(child);
		 return new ResponseEntity<String>(childDetail,HttpStatus.CREATED);
		 
		 
	  }
	  
	  @GetMapping("/summary")
	  public ResponseEntity<List<Object>>  allSummary(){ 
		  
		 List<Object> list= service.showSummary();
		 return new ResponseEntiy<List<Object>>(list,HttpStatus.OK);
		  
	  }
	  
	  @GetMapping("/graduationYear")
	  public ResponseEntity<List<Integer>>  selectYear(){
		  
		  List<Integer> year=service.graduationYear();
		  return new ResponseEntity<List<Integer>>(year,HttpStatus.OK);
		  
		  
	  }
	 
	  
	 
}
