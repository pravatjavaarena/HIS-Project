package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CASES")
public class DC_Cases {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer caseId;
	private Integer caseNum;
	private  Integer appId;
	private  Integer planId;


}
