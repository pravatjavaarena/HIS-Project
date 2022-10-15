package com.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.entity.CitizenAppEntity;
import com.ashokit.entity.DC_Cases;
import com.ashokit.repo.DC_CasesRepo;
import com.ashokit.repo.SearchAppIdRepo;

public class SearchAppIdImpl   implements ISearchAppId{

	@Autowired
	  private SearchAppIdRepo  repo;
	@Autowired
	private DC_CasesRepo  dcRepo;
	@Override
	public Integer  searchAppId(Integer id) {
		
		Optional<CitizenAppEntity>  entity=repo.findById(id);
		CitizenAppEntity citizen=entity.get();
		if(citizen !=null) {
			
			DC_Cases  dc=new  DC_Cases();
			dc.setCaseNum(id);
			dc.setAppId(citizen.getAppId());
			dc.setPlanId(id);
			DC_Cases  dcCase=dcRepo.save(dc);
			return dcCase.getCaseId();

			 
		}
		
	    	public String searchPlan() {
			
			
	    	}
		
				
	}

}
