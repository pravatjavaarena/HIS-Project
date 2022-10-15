package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CitizenAppEntity;

public interface SearchAppIdRepo extends JpaRepository<CitizenAppEntity,Integer> {
	

}
