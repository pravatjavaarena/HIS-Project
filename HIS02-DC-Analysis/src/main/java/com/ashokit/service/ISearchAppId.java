package com.ashokit.service;

import java.util.List;

import com.ashokit.binding.ChildrenDetail;
import com.ashokit.binding.CitizenPlan;
import com.ashokit.binding.EducationDetail;
import com.ashokit.binding.IncomeDetail;
import com.ashokit.binding.NewChildren;

public interface ISearchAppId {
	
	public Integer searchAppId(Integer id);
	public Integer generateCaseNumber(Integer id);
	public  List<String>  searchPlan();
	public String  planSelection(CitizenPlan plan);
	public  String saveIncome(IncomeDetail detail);
	public List<Integer>  graduationYear();
	public String saveEducation(EducationDetail education);	
	public String saveChidren(ChildrenDetail children);
	public String addChild(NewChildren  children);
	public List<Object>  showSummary();
	
	
	

}
