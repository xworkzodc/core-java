package com.xworkz.freedomFighters.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "freedomFighters_info")
public class FreedomEntity extends ParentEntity {
	@Id
	private Integer id;
	private String name;
	private LocalDateTime dob;
	private LocalDateTime dod;
	private String gender;
	private String location;
	
	public FreedomEntity(Integer id,String name,LocalDateTime dob, LocalDateTime dod,String gender,String location,String createdBy, LocalDate crateDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, crateDate, updatedBy, updatedDate);
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.dod=dod;
		this.gender=gender;
		this.location=location;
		
	}


	}


