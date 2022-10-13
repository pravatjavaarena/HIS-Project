package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.binding.CitizenApp;
import com.ashokit.entity.CitizenAppEntity;

public interface CitizenAppRepo extends  JpaRepository<CitizenAppEntity,Integer> {

	
	

}
