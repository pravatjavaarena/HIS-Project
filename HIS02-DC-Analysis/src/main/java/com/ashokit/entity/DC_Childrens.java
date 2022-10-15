package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CHILDRENS")
public class DC_Childrens {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cId;
	private Integer caseNum;
	private  String  childName;
	private Integer childAge;
	private Integer ssn;
	private LocalDate dob;
	

}
