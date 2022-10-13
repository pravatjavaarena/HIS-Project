package com.ashokit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.binding.CitizenApp;
import com.ashokit.entity.CitizenAppEntity;
import com.ashokit.repo.CitizenAppRepo;

@Service
public class ArServiceImpl implements IArService {
	
	@Autowired
	private CitizenAppRepo repo;

	@Override
	public Integer createApplication(CitizenApp citizen) {
		
		
		 String endPointUrl="https://ssa-web-api.herokuapp.com/ssn/{ssn}";
		 RestTemplate rt=new RestTemplate();
		 ResponseEntity<String> resEntity=rt.getForEntity(endPointUrl,String.class,citizen.getSsn());
		 String stateName=resEntity.getBody();
		
		  if("New Jersey".equals(stateName)) {
		 CitizenAppEntity citizen2=new  CitizenAppEntity();
		 BeanUtils.copyProperties(citizen, citizen2);
		 
		 citizen2.setStateName(stateName);
		 
			 CitizenAppEntity entity=repo.save(citizen2);
			 
			 return  entity.getAppId();
			
		 }
		  else {
			  
		     return 0;
	    }
	}
}
