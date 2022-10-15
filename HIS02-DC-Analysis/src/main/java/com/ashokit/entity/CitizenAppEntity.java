package com.ashokit.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class CitizenAppEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  appId;
	private String fullname;
	private String email;
	private Long phno;
	private String gender;
	private Long ssn;
	private String stateName;
	@CreationTimestamp
	private  Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;

}
