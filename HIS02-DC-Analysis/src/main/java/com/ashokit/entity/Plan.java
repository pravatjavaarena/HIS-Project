package com.ashokit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

	public class Plan {
		
		@Column(name="PLAN_ID")
		@GeneratedValue	
		@Id
		private Integer planId;
		
		@Column(name="PLAN_NAME",length=40)
		private String planName;
		
		@Column(name="PLAN_START_DATE")
		private LocalDateTime startDate;
		
		@Column(name="PLAN_END_DATE")
		private LocalDateTime endDate;
		
		@OneToOne
		private PlanCategory category;
		
		
		@Column(name="ACTIVE_SW",length=10)
		private String activeSw;
		
		
	    @Column(name="CREATE_DATE")
		private LocalDate createDate;	
	    
		@Column(name="UPDATE_DATE")
		private LocalDate updateDate;
		
		@Column(name="CREATED_BY")
		private String createdBy;
		
		@Column(name="UPDATED_BY")
		private String updatedBy;
		
		
	}



