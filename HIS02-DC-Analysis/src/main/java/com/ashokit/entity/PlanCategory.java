package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class PlanCategory {
		
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	@Id
	private Integer categoryId;
	
	@Column(name="CATEGORY_NAME",length=30)
	private String categoryName;
	
	@Column(name="ACTIVE_SW",length=10)
	private String activeSw;
	
	
	@Column(name="CREATED_BY",length=30)
	private String createdBy;
	@Column(name="UPDATED_BY",length=30)
	private String updatedBy;
	
	
	@Column(name="CREATE_DATE")
	private LocalDate createDate;
	@Column(name="UPDATE_DATE")
	private LocalDate updateDate;
	

}
